package commanders;

import boxes.Box;

/**
 * Class for box command.
 */
public class BoxCommand {
  /**
   * Amount in box elements.
   */
  private int amount;

  /**
   * Type elements in box.
   */
  private String type;

  /**
   * constructor for box command.
   */
  public BoxCommand() {
  }

  /**
   * Get amount.
   *
   * @return amount
   */
  public int getAmount() {
    return amount;
  }

  /**
   * set new amount.
   *
   * @param amountElements amount
   */
  public void setAmount(final int amountElements) {
    this.amount = amountElements;
  }

  /**
   * get type elements in box.
   *
   * @return string type.
   */
  public String getType() {
    return type;
  }

  /**
   * Set new type elements in box.
   *
   * @param typeElement string type.
   */
  public void setType(final String typeElement) {
    this.type = typeElement;
  }

  /**
   * Pack elements in box.
   *
   * @param box    box in which we put elements
   * @param action action (add or retrieve)
   */
  public void pack(final Box box, final Action action) {
    switch (action) {
      case ADD -> box.add(amount, type);
      case RETRIEVE -> box.retrieve(amount, type);
      default -> System.out.println("Error type action");
    }
  }
}
