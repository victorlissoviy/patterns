package content.computers;

import interfaces.IComputer;

/**
 * class for director computer.
 */
public final class DirectorComputer implements IComputer {
  /**
   * cost of computer.
   */
  private int cost;
  @Override
  public int getCost() {
    return cost;
  }

  @Override
  public void setCost(final int costComputer) {
    this.cost = costComputer;
  }
}
