package work0.devices;

import lombok.Getter;
import work0.enums.SwitchStatus;

@Getter
public class SwitchDevice {
  private SwitchStatus status;

  public SwitchDevice() {
    this(SwitchStatus.OFF);
  }

  public SwitchDevice(SwitchStatus status) {
    setStatus(status);
  }

  public void setStatus(SwitchStatus status) {
    this.status = status;
  }

  public void turnOn() {
    this.status = SwitchStatus.ON;
    System.out.println("Switch Device On");
  }

  public void turnOff() {
    this.status = SwitchStatus.OFF;
    System.out.println("Switch Device Off");
  }

  public boolean isOn() {
    return status == SwitchStatus.ON;
  }
}
