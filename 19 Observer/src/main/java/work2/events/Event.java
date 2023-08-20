package work2.events;

import lombok.Getter;
import work2.subscribers.Subscriber;

import java.util.HashSet;
import java.util.Set;

@Getter
public abstract class Event {
  private final Set<Subscriber> subscribers = new HashSet<>();
  private final String name;
  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public Event() {
    this.name = this.getClass().getSimpleName();
  }

  @Override
  public int hashCode() {
    return this.name.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (obj instanceof Event o) {
      return this.getName().equals(o.getName());
    }
    return false;
  }
}
