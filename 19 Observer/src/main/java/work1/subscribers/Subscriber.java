package work1.subscribers;

import work1.events.Event;
import work1.goods.Good;

public interface Subscriber {
  void updateNotify(Event event);
  Good getGood();
  void setGood(Good good);
}
