package main;

import messages.Message;
import modifiers.ImportanceModifier;
import modifiers.MessageModifier;
import modifiers.ValueModifier;

/**
 * Main class.
 *
 * @author victor
 * @version 1.0
 */
public final class Main {
  /**
   * private constructor.
   */
  private Main() {
  }

  /**
   * Main method.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    final int maginNUmber1 = 10;
    final int maginNUmber2 = 100;
    Message message = new Message();
    message.setValue(maginNUmber1);
    message.setImportance(maginNUmber2);
    message.setTitle("message");
    System.out.println(message);

    MessageModifier messageModifier = new MessageModifier(message);
    messageModifier.add(new ImportanceModifier(message));
    messageModifier.add(new ValueModifier(message));

    messageModifier.handle();

    System.out.println(message);
  }
}
