package work2.main;

import work2.events.EmailEvent;
import work2.events.Event;
import work2.events.SMSEvent;
import work2.events.SocialEvent;
import work2.puplishers.Hub;
import work2.subscribers.Desktop;
import work2.subscribers.Laptop;
import work2.subscribers.Phone;
import work2.subscribers.Subscriber;

public class Main {
  public static void main(String[] args) {
    Event emailEvent = new EmailEvent();
    Event smsEvent = new SMSEvent();
    Event socialEvent = new SocialEvent();

    Subscriber phone = new Phone();
    Subscriber laptop = new Laptop();
    Subscriber desktop = new Desktop();

    Hub publisher = new Hub();

    publisher.subscribe(emailEvent, laptop);
    publisher.subscribe(emailEvent, desktop);
    publisher.subscribe(smsEvent, phone);
    publisher.subscribe(socialEvent, desktop);
    publisher.subscribe(socialEvent, phone);

    publisher.sendEmails("Email message");
    publisher.sendSMS("SMS message");
    publisher.sendSocial("Social message");

    publisher.unsubscribe(smsEvent, desktop);
    publisher.unsubscribe(socialEvent, desktop);

    System.out.println();
    publisher.sendEmails("Email message");
    publisher.sendSMS("SMS message");
    publisher.sendSocial("Social message");
  }
}
