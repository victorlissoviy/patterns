package content.chairs;

import interfaces.IChair;

/**
 * class for director chair.
 */
public final class DirectorChair implements IChair {
  /**
   * cost of director chair.
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
