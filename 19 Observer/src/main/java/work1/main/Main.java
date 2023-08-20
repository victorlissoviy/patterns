package work1.main;

import work1.events.UpdateGoodEvent;
import work1.goods.Good;
import work1.publishers.WebShop;
import work1.subscribers.Visitor;

public class Main {

  public static void main(String[] args) {
    UpdateGoodEvent event = new UpdateGoodEvent();

    Good good = new Good("Water", 10);

    Visitor visitor1 = new Visitor(good);

    WebShop webShop = new WebShop(event);

    webShop.subscribe(event, visitor1);

    webShop.addGoods(new Good("Water"));
    webShop.addGoods(new Good("Хліб"));

    webShop.removeGood(new Good("Water", 5));

    webShop.unsubscribe(event, visitor1);
  }
}
