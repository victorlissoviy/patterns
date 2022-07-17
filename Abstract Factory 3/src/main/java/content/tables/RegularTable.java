package content.tables;

import interfaces.ITable;

/**
 * class for regular table.
 */
public final class RegularTable implements ITable {
  /**
   * cost table.
   */
  private int cost;

  @Override
  public int getCost() {
    return cost;
  }

  @Override
  public void setCost(final int costTable) {
    this.cost = costTable;
  }
}
