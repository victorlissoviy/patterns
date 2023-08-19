package work0.publishers;

import work0.events.Event;

public class WebShop extends Publisher {
  private int countVisitors = 0;
  private final Event event;
  public WebShop(Event event) {
    this.event = event;
  }

  public void inVisitor() {
    countVisitors++;
    event.setMessage("Зайшов один відвідувач, загалом " + countVisitors);
    this.notifySend(event);
  }

  public void outVisitor() {
    countVisitors--;
    event.setMessage("Вийшов один відвідувач, загалом " + countVisitors);
    this.notifySend(event);
  }
}
