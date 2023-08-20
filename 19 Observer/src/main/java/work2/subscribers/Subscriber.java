package work2.subscribers;

import work2.events.Event;

public interface Subscriber {
  void updateNotify(Event event);

}
