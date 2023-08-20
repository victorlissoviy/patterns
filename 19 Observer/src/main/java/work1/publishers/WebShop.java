package work1.publishers;

import work1.events.UpdateGoodEvent;
import work1.goods.Good;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WebShop extends Publisher {
  @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
  private final Set<Good> goods;
  private final UpdateGoodEvent event;

  public WebShop(UpdateGoodEvent event) {
    goods = new HashSet<>();
    this.event = event;
  }

  public synchronized void addGoods(Good... addedGoods) {
    this.goods.addAll(List.of(addedGoods));
    for (Good good : addedGoods) {
      this.event.setMessage("added");
      this.event.setGood(good);
      this.notifySend(event);
    }
  }

  public synchronized void removeGood(Good good) {
    this.goods.remove(good);
    this.event.setMessage("removed");
    this.event.setGood(good);
    this.notifySend(event);
  }
}
