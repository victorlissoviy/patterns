package modifiers;

import messages.Message;

/**
 * Class for modifier messageModifier.
 */
public class MessageModifier {
  /**
   * message for modifier.
   */
  private Message message;

  /**
   * Get message for modifier.
   *
   * @return message.
   */
  public Message getMessage() {
    return message;
  }

  /**
   * Set new message.
   *
   * @param messageNew message
   */
  public void setMessage(final Message messageNew) {
    this.message = messageNew;
  }

  /**
   * Message for chain of Responsibility.
   */
  private MessageModifier messageModifier;

  /**
   * Add new messageModifier for more checks.
   *
   * @param messageNew messageModifier
   */
  public void add(final MessageModifier messageNew) {
    if (messageModifier != null) {
      messageModifier.add(messageNew);
    } else {
      messageModifier = messageNew;
    }
  }

  /**
   * Handle check.
   */
  public void handle() {
    if (messageModifier != null) {
      messageModifier.handle();
    } else {
      System.out.println("All ok");
    }
  }

  /**
   * Constructor for message modification.
   *
   * @param messageModification message.
   */
  public MessageModifier(final Message messageModification) {
    this.message = messageModification;
  }
}
