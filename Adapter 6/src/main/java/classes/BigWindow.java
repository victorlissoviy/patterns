package classes;

import interfaces.Menu;

/**
 * class for BigWindow.
 */
public final class BigWindow implements Menu {
  /**
   * create the window.
   */
  @Override
  public void create() {
    System.out.println("create a window");
  }

  /**
   * submit the window.
   */
  @Override
  public void submit() {
    System.out.println("submit the window");
  }
}
