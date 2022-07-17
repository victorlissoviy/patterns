package demo;

import classes.HdmiPort;
import classes.UsbPort;
import decorators.FastSpeedPortDecorator;
import interfaces.Port;

/**
 * Main class.
 */
public final class Main {
  /**
   * Constructor.
   */
  private Main() {
  }

  /**
   * Main Method.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    Port port = new FastSpeedPortDecorator(new HdmiPort());
    Port port2 = new FastSpeedPortDecorator(new UsbPort());

    System.out.println(port.plugin());
    System.out.println(port2.plugin());
  }
}
