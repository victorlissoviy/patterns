package work1.subscribers;

import work1.events.Event;
import work1.goods.Good;

public class Visitor implements Subscriber {
  private Good good;

  public Visitor (Good good) {
    setGood(good);
  }
  @Override
  public void updateNotify(Event event) {
    System.out.println(event.getMessage() + " " + event.getGood());
  }

  @Override
  public Good getGood() {
    return this.good;
  }

  @Override
  public void setGood(Good good) {
    this.good = good;
  }
}
