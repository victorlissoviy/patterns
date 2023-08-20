package work2.puplishers;

import work2.events.EmailEvent;
import work2.events.Event;
import work2.events.SMSEvent;
import work2.events.SocialEvent;

public class Hub extends Publisher {

  public Hub() {
  }

  private void prepareAndSend(String message, Event event) {
    event.setMessage(message);
    this.notifySend(event);
  }

  public void sendEmails(String message) {
    EmailEvent event = new EmailEvent();
    prepareAndSend(message, event);
  }

  public void sendSMS(String message) {
    SMSEvent event = new SMSEvent();
    prepareAndSend(message, event);
  }

  public void sendSocial(String message) {
    SocialEvent event = new SocialEvent();
    prepareAndSend(message, event);
  }
}
