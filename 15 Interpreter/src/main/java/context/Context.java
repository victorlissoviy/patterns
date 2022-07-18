package context;

import expressions.Expression;
import expressions.MinusExpression;
import expressions.NumberExpression;
import expressions.PlusExpression;

/**
 * Class for context.
 */
public class Context {

  /**
   * Method for calculate expressions.
   *
   * @param stringExpression String line expression.
   * @return result expression.
   */
  public Expression evaluateExpression(final String stringExpression) {
    int position = stringExpression.length() - 1;
    while (position > 0) {
      if (Character.isDigit(stringExpression.charAt(position))) {
        position--;
      } else {
        Expression left = evaluateExpression(
                stringExpression.substring(0, position));
        Expression right = new NumberExpression(
                Integer.parseInt(
                        stringExpression.substring(position + 1)));
        char operator = stringExpression.charAt(position);
        return switch (operator) {
          case '-' -> new MinusExpression(left, right);
          case '+' -> new PlusExpression(left, right);
          default -> throw new RuntimeException("error operator");
        };
      }
    }
    int result = Integer.parseInt(stringExpression);
    return new NumberExpression(result);
  }
}
