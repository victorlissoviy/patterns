package content.phones;

import interfaces.IPhone;

/**
 * class for regular phone.
 */
public final class RegularPhone implements IPhone {
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
