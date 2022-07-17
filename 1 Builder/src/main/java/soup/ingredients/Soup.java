package soup.ingredients;

import vegetables.Vegetable;

import java.util.Arrays;
import java.util.List;

/**
 * Main class for soup.
 */
public final class Soup implements ISoup {
  /**
   * water for soup.
   */
  private Water soupWater;
  /**
   * vegetables for soup.
   */
  private List<Vegetable> soupVegetables;

  public static final class Builder {
    /**
     * @return soup.
     */
    public Soup getSoup() {
      return new Soup();
    }

    /**
     * @param water water for soup.
     * @param vegetables vegetables for soup
     * @return soup witch ingredients.
     */
    public Soup getSoup(final Water water, final Vegetable... vegetables) {
      Soup soup = new Soup();
      soup.setWater(water);
      soup.setVegetables(vegetables);
      return soup;
    }
  }

  @Override
  public void setWater(final Water water) {
    this.soupWater = water;
  }

  @Override
  public void setVegetables(final Vegetable... vegetables) {
    this.soupVegetables = Arrays.asList(vegetables);
  }

  private Soup() {

  }
}
