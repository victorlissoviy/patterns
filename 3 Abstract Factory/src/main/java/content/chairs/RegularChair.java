package content.chairs;

import interfaces.IChair;

/**
 * class for regular chair.
 */
public final class RegularChair implements IChair {
  /**
   * Regular chair cost.
   */
  private int cost;
  @Override
  public int getCost() {
    return cost;
  }

  @Override
  public void setCost(final int costChair) {
    this.cost = costChair;
  }
}
