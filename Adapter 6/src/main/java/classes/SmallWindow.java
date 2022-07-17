package classes;

import interfaces.Alert;

/**
 * class for small window.
 */
public final class SmallWindow implements Alert {
  /**
   * create a small window.
   */
  @Override
  public void create() {
    System.out.println("Create small window.");
  }

  /**
   * close small window.
   */
  @Override
  public void close() {
    System.out.println("close small window.");
  }
}
