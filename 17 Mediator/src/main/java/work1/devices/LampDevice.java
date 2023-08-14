package work1.devices;

import work1.enums.BatteryStatus;
import work1.enums.SwitchStatus;

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
