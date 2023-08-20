package work2.subscribers;

import work2.events.Event;

public class Laptop implements Subscriber {

  @Override
  public void updateNotify(Event event) {
    System.out.println(this.getClass().getSimpleName() + ": " + event.getMessage());
  }
}
