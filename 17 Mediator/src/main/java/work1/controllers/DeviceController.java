package work1.controllers;

import work1.devices.BatteryDevice;
import work1.devices.LampDevice;
import work1.devices.SwitchDevice;
import work1.enums.BatteryStatus;
import work1.enums.SwitchStatus;
import work1.interfaces.IDeviceController;

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
