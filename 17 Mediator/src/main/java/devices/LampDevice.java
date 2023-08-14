package devices;

import enums.BatteryStatus;
import enums.SwitchStatus;

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
