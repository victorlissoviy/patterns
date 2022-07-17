package renders;

import renders.interfaces.Render;
import shapes.Shape;

/**
 * Class for colour render.
 */
public final class Colour implements Render {
  @Override
  public void draw(final Shape shape) {
    System.out.println(shape + " colour rendered");
  }
}
