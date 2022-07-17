package boxes;

/**
 * Class for box.
 */
public class Box {
  /**
   * Amount elements in box.
   */
  private int amount;
  /**
   * Type of elements in box.
   */
  private String type;

  /**
   * Add elements in box.
   *
   * @param addAmount   amount.
   * @param typeElement type elements.
   */
  public void add(final int addAmount, final String typeElement) {
    if (type.equals(typeElement)) {
      amount += addAmount;
    } else {
      System.out.println("Type is not valid.");
    }
  }

  /**
   * Remove elements from box.
   *
   * @param removeAmount amount.
   * @param typeElement  type elements.
   */
  public void retrieve(final int removeAmount, final String typeElement) {
    if (type.equals(typeElement)) {
      amount -= removeAmount;
    } else {
      System.out.println("Type is not valid.");
    }
  }

  /**
   * simple constructor for box.
   */
  public Box() {
  }

  /**
   * Constructor for set parameters.
   *
   * @param amountElements amount
   * @param typeElements   type.
   */
  public Box(final int amountElements, final String typeElements) {
    this.amount = amountElements;
    this.type = typeElements;
  }

  /**
   * return Box as String.
   *
   * @return string line.
   */
  @Override
  public String toString() {
    return "Box{" + "amount=" + amount
            + ", type='" + type + '\'' + '}';
  }
}
