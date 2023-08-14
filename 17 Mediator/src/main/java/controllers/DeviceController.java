package controllers;

import devices.BatteryDevice;
import devices.LampDevice;
import devices.SwitchDevice;
import enums.BatteryStatus;
import enums.SwitchStatus;
import interfaces.IDeviceController;

public class DeviceController implements IDeviceController {

  BatteryDevice batteryDevice;
  SwitchDevice switchDevice;
  LampDevice lampDevice;

  public DeviceController(BatteryDevice batteryDevice, SwitchDevice switchDevice, LampDevice lampDevice) {
    this.batteryDevice = batteryDevice;
    this.switchDevice = switchDevice;
    this.lampDevice = lampDevice;
  }

  @Override
  public void nextStepForTurnOn() {
    BatteryStatus batteryStatus = batteryDevice.getStatus();
    SwitchStatus switchStatus = switchDevice.getStatus();

    if (lampDevice.turnOn(batteryStatus, switchStatus)) {
      batteryDevice.discharge();
      switchDevice.turnOff();
      return;
    }

    if (batteryDevice.isCharged()) {
      if (!switchDevice.isOn()) {
        switchDevice.turnOn();
      }
    } else {
      batteryDevice.charge();
    }
  }
}
