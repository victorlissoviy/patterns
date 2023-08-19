package work0.controllers;

import work0.devices.BatteryDevice;
import work0.devices.LampDevice;
import work0.devices.SwitchDevice;
import work0.enums.BatteryStatus;
import work0.enums.SwitchStatus;
import work0.interfaces.IDeviceController;

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
