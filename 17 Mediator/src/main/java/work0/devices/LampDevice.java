package work0.devices;

import work0.enums.BatteryStatus;
import work0.enums.SwitchStatus;

public class LampDevice {

  public LampDevice() {
  }
  public boolean turnOn(BatteryStatus batteryStatus, SwitchStatus switchStatus) {
    boolean status = false;
    if (batteryStatus == BatteryStatus.CHARGED && switchStatus == SwitchStatus.ON) {
      System.out.println("Lamp on");
      status = true;
    }
    return status;
  }
}
