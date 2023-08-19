package work0.subscribers;

import work0.events.Event;

public class MainPanel implements Subscriber {
  @Override
  public void updateContext(Event event) {
    System.out.println(event.getMessage());
  }
}
