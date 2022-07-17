package modifiers;

import exceptions.BannedModifier;
import messages.Message;

/**
 * Class for Value modification message.
 */
public final class ValueModifier extends MessageModifier {
  /**
   * public constructor.
   *
   * @param messageModification message for modification.
   */
  public ValueModifier(final Message messageModification) {
    super(messageModification);
  }

  @Override
  public void handle() {
    Message message = getMessage();
    if (message == null) {
      throw new BannedModifier("Value error");
    }
    message.setValue(message.getValue() + 1);
    setMessage(message);
    super.handle();
  }
}
