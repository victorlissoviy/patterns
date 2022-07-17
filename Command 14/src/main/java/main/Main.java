package main;

import boxes.Box;
import commanders.Action;
import commanders.BoxCommand;

/**
 * Main class.
 */
public final class Main {
  /**
   * Private constructor.
   */
  private Main() {
  }

  /**
   * Main method.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    Box box = new Box(0, "Cat");
    System.out.println(box);
    BoxCommand boxCommand = new BoxCommand();
    boxCommand.pack(box, Action.ADD);
    System.out.println(box);

  }
}
