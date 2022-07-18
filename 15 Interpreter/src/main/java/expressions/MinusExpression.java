package expressions;

/**
 * Class for minus expression.
 */
public final class MinusExpression implements Expression {
  /**
   * Left expression.
   */
  private Expression left;
  /**
   * Right expression.
   */
  private Expression right;

  /**
   * Method for minus expression.
   *
   * @param leftExpression  expression left.
   * @param rightExpression expression right.
   */
  public MinusExpression(
          final Expression leftExpression,
          final Expression rightExpression) {
    this.left = leftExpression;
    this.right = rightExpression;
  }

  @Override
  public int interpret() {
    return left.interpret() - right.interpret();
  }
}
