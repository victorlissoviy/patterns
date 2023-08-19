package work0.subscribers;

import work0.events.Event;

public interface Subscriber {
  void updateContext(Event event);
}
