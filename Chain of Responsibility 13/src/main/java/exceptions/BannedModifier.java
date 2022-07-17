package exceptions;

/**
 * Exception for message modifications.
 */
public class BannedModifier extends RuntimeException {
  /**
   * Constructor exception.
   *
   * @param text message.
   */
  public BannedModifier(final String text) {
    super(text);
  }
}
