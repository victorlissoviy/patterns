package expressions;

/**
 * Class for number expression.
 */
public final class NumberExpression implements Expression {

  /**
   * number fot return.
   */
  private int number;

  /**
   * Method for number expression.
   *
   * @param numberExpression number.
   */
  public NumberExpression(final int numberExpression) {
    this.number = numberExpression;
  }

  @Override
  public int interpret() {
    return number;
  }
}
