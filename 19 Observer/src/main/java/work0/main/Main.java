package work0.main;

import work0.events.Event;
import work0.events.VisitorCountEvent;
import work0.publishers.WebShop;
import work0.subscribers.MainPanel;
import work0.subscribers.Subscriber;

public class Main {
  public static void main(String[] args) {
    Event event = new VisitorCountEvent();

    Subscriber subscriber = new MainPanel();

    WebShop publisher = new WebShop(event);

    publisher.inVisitor();
    publisher.inVisitor();
    publisher.outVisitor();

    publisher.subscribe(event, subscriber);

    publisher.inVisitor();
    publisher.inVisitor();
    publisher.outVisitor();

    publisher.unsubscribe(event, subscriber);

    publisher.inVisitor();
    publisher.inVisitor();
    publisher.outVisitor();
  }
}
