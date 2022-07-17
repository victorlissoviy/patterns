package messages;

/**
 * Class for messages.
 */
public final class Message {
  /**
   * Importance of message.
   */
  private int importance;
  /**
   * Value of message.
   */
  private int value;
  /**
   * Message title.
   */
  private String title;

  /**
   * Get importante.
   *
   * @return importante.
   */
  public int getImportance() {
    return importance;
  }

  /**
   * set new importante.
   *
   * @param importanceMessage importante.
   */
  public void setImportance(final int importanceMessage) {
    this.importance = importanceMessage;
  }

  /**
   * Get value.
   *
   * @return value.
   */
  public int getValue() {
    return value;
  }

  /**
   * Set new value.
   *
   * @param valueMessage Value.
   */
  public void setValue(final int valueMessage) {
    this.value = valueMessage;
  }

  /**
   * Get title.
   *
   * @return title.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Set new title.
   *
   * @param titleMessage title.
   */
  public void setTitle(final String titleMessage) {
    this.title = titleMessage;
  }

  @Override
  public String toString() {
    return "Message{" + "importance=" + importance
            + ", value=" + value
            + ", title='" + title + '\'' + '}';
  }
}
