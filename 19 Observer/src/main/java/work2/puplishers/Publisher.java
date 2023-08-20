package work2.puplishers;

import work2.events.Event;
import work2.subscribers.Subscriber;

import java.util.HashSet;
import java.util.Set;

public abstract class Publisher {
  private final Set<Event> events = new HashSet<>();

  public void subscribe(Event event, Subscriber subscriber) {
    if (events.contains(event)) {
      for (Event e : events) {
        if (e.equals(event)) {
          e.getSubscribers().add(subscriber);
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
    if (events.contains(event)) {
      for (Event e : events) {
        if (e.equals(event)) {
          for (Subscriber subscriber : e.getSubscribers()) {
            subscriber.updateNotify(event);
          }
        }
      }
    }
  }
}
