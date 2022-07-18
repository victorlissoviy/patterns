package expressions;

/**
 * Class for plus expression.
 */
public final class PlusExpression implements Expression {

  /**
   * Left expression.
   */
  private Expression left;
  /**
   * Right expression.
   */
  private Expression right;

  /**
   * Method for plus expression.
   *
   * @param leftExpression  expression.
   * @param rightExpression expression.
   */
  public PlusExpression(
          final Expression leftExpression,
          final Expression rightExpression) {
    this.left = leftExpression;
    this.right = rightExpression;
  }

  @Override
  public int interpret() {
    return left.interpret() + right.interpret();
  }
}
