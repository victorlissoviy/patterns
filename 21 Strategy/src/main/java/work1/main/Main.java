package work1.main;

import work1.barmens.Barmen;
import work1.clients.Client;
import work1.strategies.StrategyForHappyMen;
import work1.strategies.StrategyForMen;
import work1.strategies.StrategyForSadMan;
import work1.strategies.StrategyForWoman;

public class Main {
  public static void main(String[] args) {
    Barmen barmen = new Barmen(new StrategyForMen());

    System.out.println(barmen.getDrink());

    barmen.setStrategy(new StrategyForHappyMen());
    System.out.println(barmen.getDrink());

    barmen.setStrategy(new StrategyForWoman());
    System.out.println(barmen.getDrink());

    barmen.setStrategy(new StrategyForSadMan());
    System.out.println(barmen.getDrink());

    barmen = new Barmen(Client.HAPPYMAN);
    System.out.println(barmen.getDrink());
  }
}
