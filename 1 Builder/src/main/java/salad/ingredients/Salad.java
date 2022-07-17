package salad.ingredients;

import vegetables.Vegetable;

import java.util.ArrayList;
import java.util.List;


/**
 * Class salad witch lombok.
 */
public final class Salad {
  /**
   * Vegetables for salad.
   */
  private List<Vegetable> vegetables;

  /**
   * simple constructor.
   */
  public Salad() {
    vegetables = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "Salad{"
            + "vegetables=" + vegetables
            + '}';
  }


}
