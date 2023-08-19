package work0.publishers;

import work0.events.Event;
import work0.subscribers.Subscriber;

import java.util.HashSet;
import java.util.Set;

public abstract class Publisher {

  private final Set<Event> events = new HashSet<>();

  public Publisher() {
  }

  public void subscribe(Event event, Subscriber subscriber) {
    if (events.contains(event)) {
      for (Event e : events) {
        if (e.equals(event)) {
          e.getSubscribers().add(subscriber);
          break;
        }
      }
    } else {
      event.getSubscribers().add(subscriber);
      events.add(event);
    }
  }

  public void unsubscribe(Event event, Subscriber subscriber) {
    if (events.contains(event)) {
      for (Event e : events) {
        if (e.equals(event)) {
          e.getSubscribers().remove(subscriber);
        }
      }
    }
  }

  public void notifySend(Event event) {
    for (Subscriber subscriber : event.getSubscribers()) {
      subscriber.updateContext(event);
    }
  }
}
