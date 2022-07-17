package main;

import renders.GrayStyle;
import renders.interfaces.Render;
import shapes.Circle;
import shapes.Shape;

/**
 * Main class.
 */
public final class Main {
  /**
   * Main constructor.
   */
  private Main() {
  }

  /**
   * Main method.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    Shape shape = new Circle();
    Render render = new GrayStyle();

    render.draw(shape);

  }
}
