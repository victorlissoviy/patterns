package main;

import controllers.DeviceController;
import devices.BatteryDevice;
import devices.LampDevice;
import devices.SwitchDevice;
import interfaces.IDeviceController;

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
