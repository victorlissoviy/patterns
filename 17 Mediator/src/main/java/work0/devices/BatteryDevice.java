package work0.devices;

import lombok.Getter;
import work0.enums.BatteryStatus;

@Getter
public class BatteryDevice {
  private BatteryStatus status;

  public BatteryDevice() {
    this(BatteryStatus.DISCHARGED);
  }

  public BatteryDevice(BatteryStatus status) {
    setStatus(status);
  }

  public void setStatus(BatteryStatus status) {
    this.status = status;
  }

  public void charge() {
    this.status = BatteryStatus.CHARGED;
    System.out.println("Battery Device Charged");
  }

  public void discharge() {
    this.status = BatteryStatus.DISCHARGED;
    System.out.println("Battery Device Discharged");
  }

  public boolean isCharged() {
    return status == BatteryStatus.CHARGED;
  }
}
