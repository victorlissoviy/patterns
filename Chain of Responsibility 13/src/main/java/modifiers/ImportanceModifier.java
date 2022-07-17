package modifiers;

import exceptions.BannedModifier;
import messages.Message;

/**
 * Class modification importance in message.
 */
public final class ImportanceModifier extends MessageModifier {
  /**
   * public constructor.
   *
   * @param messageModification message modification.
   */
  public ImportanceModifier(final Message messageModification) {
    super(messageModification);
  }

  @Override
  public void handle() {
    Message message = getMessage();
    if (message == null) {
      throw new BannedModifier("Importance error");
    }
    message.setImportance(message.getImportance() + 1);
    setMessage(message);
    super.handle();
  }
}
