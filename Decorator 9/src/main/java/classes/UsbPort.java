package classes;

import interfaces.Port;

import java.util.Random;

/**
 * Class for usb port.
 */
public final class UsbPort implements Port {
  /**
   * Serial number for port.
   */
  private int serialNumber;

  /**
   * Get serial number port.
   *
   * @return serial number.
   */
  public int getSerialNumber() {
    return serialNumber;
  }

  /**
   * Set the serial number port.
   *
   * @param serialNumberPort Serial number port.
   */
  public void setSerialNumber(final int serialNumberPort) {
    this.serialNumber = serialNumberPort;
  }

  @Override
  public String plugin() {
    return "Usb port plugined:\n\tserial number: "
            + getSerialNumber();
  }

  /**
   * Constructor set random serial port.
   */
  public UsbPort() {
    final int magicNumber = 1000;
    setSerialNumber(new Random().nextInt(magicNumber));
  }
}
