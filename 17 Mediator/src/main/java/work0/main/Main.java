package work0.main;

import work0.controllers.DeviceController;
import work0.devices.BatteryDevice;
import work0.devices.LampDevice;
import work0.devices.SwitchDevice;
import work0.interfaces.IDeviceController;

public class Main {
  public static void main(String[] args) {
    BatteryDevice batteryDevice = new BatteryDevice();
    SwitchDevice switchDevice = new SwitchDevice();
    LampDevice lampDevice = new LampDevice();

    IDeviceController controller = new DeviceController(batteryDevice, switchDevice, lampDevice);

    controller.nextStepForTurnOn();
    System.out.println();
    controller.nextStepForTurnOn();
    System.out.println();
    controller.nextStepForTurnOn();
    System.out.println();
    controller.nextStepForTurnOn();
    System.out.println();
    controller.nextStepForTurnOn();
    System.out.println();
  }
}
