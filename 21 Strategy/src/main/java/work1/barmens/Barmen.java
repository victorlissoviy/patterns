package work1.barmens;

import lombok.Getter;
import lombok.NonNull;
import work1.clients.Client;
import work1.strategies.StrategyForHappyMen;
import work1.strategies.StrategyForMen;
import work1.strategies.StrategyForSadMan;
import work1.strategies.StrategyForWoman;
import work1.strategies.interfaces.Strategy;

@Getter
public class Barmen {
  Strategy strategy;

  public Barmen(Strategy strategy) {
    this.strategy = strategy;
  }

  public Barmen(@NonNull Client client) {
    strategy = switch (client) {
      case MAN -> new StrategyForMen();
      case WOMAN -> new StrategyForWoman();
      case SADMAN -> new StrategyForSadMan();
      case HAPPYMAN -> new StrategyForHappyMen();
    };
  }

  public String getDrink() {
    return strategy.getDrink();
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
}
