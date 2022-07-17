package renders;

import renders.interfaces.Render;
import shapes.Shape;

/**
 * class for gray style render.
 */
public final class GrayStyle implements Render {
  @Override
  public void draw(final Shape shape) {
    System.out.println(shape + " gray style rendered");
  }
}
