package work1.strategies;

import work1.strategies.interfaces.Strategy;

public class StrategyForHappyMen implements Strategy {
  @Override
  public String getDrink() {
    return "Kokteil";
  }
}
