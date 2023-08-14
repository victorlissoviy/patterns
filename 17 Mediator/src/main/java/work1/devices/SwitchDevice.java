package work1.devices;

import work1.enums.SwitchStatus;

public class SwitchDevice {
  private SwitchStatus status;

  public SwitchDevice() {
    this(SwitchStatus.OFF);
  }

  public SwitchDevice(SwitchStatus status) {
    setStatus(status);
  }

  public SwitchStatus getStatus() {
    return status;
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
