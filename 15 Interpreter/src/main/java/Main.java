import context.Context;
import expressions.Expression;

/**
 * Main class.
 */
public final class Main {
  /**
   * private constructor.
   */
  private Main() {
  }

  /**
   * Main method.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    String stringExpression = "12578-278+33669";
//    String stringExpression = "2+(2-2)+2";
    Context context = new Context();
    Expression expression = context.evaluateExpression(stringExpression);
    System.out.println(stringExpression + " = " + expression.interpret());
  }
}
