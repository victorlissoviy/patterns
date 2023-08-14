package work1.main;

import work1.controllers.DeviceController;
import work1.devices.BatteryDevice;
import work1.devices.LampDevice;
import work1.devices.SwitchDevice;
import work1.interfaces.IDeviceController;

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
