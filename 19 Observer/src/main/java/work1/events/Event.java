package work1.events;

import lombok.Getter;
import work1.goods.Good;
import work1.subscribers.Subscriber;

import java.util.HashSet;
import java.util.Set;

@Getter
public abstract class Event {
  private final Set<Subscriber> subscribers = new HashSet<>();
  private final String name;
  private String message;
  private Good good;

  public Event() {
    this.name = this.getClass().getSimpleName();
  }

  public void setGood(Good good) {
    this.good = good;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public int hashCode() {
    return this.getName().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj instanceof Event o) {
      return o.getName().equals(this.getName());
    }
    return false;
  }
}
