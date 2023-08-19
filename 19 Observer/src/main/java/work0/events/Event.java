package work0.events;

import lombok.Getter;
import work0.subscribers.Subscriber;

import java.util.HashSet;
import java.util.Set;

@Getter
public abstract class Event {

  private final String name;

  private final Set<Subscriber> subscribers = new HashSet<>();
  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public Event() {
    this.name = this.getClass().getSimpleName();
  }

  @Override
  public int hashCode() {
    return this.getName().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (obj instanceof Event o) {
      return o.getName().equals(getName());
    }
    return false;
  }
}
