package soup.ingredients;

import vegetables.Vegetable;

/**
 * soup interface.
 */
public interface ISoup {
  /**
   * @param water water for soup.
   */
  void setWater(Water water);

  /**
   * @param vegetables vegetables for soup.
   */
  void setVegetables(Vegetable... vegetables);
}
