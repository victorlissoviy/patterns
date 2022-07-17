package content.phones;

import interfaces.IPhone;

/**
 * class for director phone.
 */
public final class DirectorPhone implements IPhone {
  /**
   * cost of phone.
   */
  private int cost;

  @Override
  public int getCost() {
    return cost;
  }

  @Override
  public void setCost(final int costPhone) {
    this.cost = costPhone;
  }
}
