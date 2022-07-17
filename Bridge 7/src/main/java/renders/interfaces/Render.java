package renders.interfaces;

import shapes.Shape;

/**
 * Interface for render.
 */
public interface Render {
  /**
   * Draw shape.
   *
   * @param shape shape for draw.
   */
  void draw(Shape shape);
}
