package content.tables;

import interfaces.ITable;

/**
 * class for director table.
 */
public final class DirectorTable implements ITable {
  /**
   * Director table cost.
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
