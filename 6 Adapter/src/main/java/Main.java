import classes.BigWindow;
import classes.SmallWindow;
import interfaces.Alert;
import interfaces.Menu;

/**
 * main class for program.
 */
public final class Main {
  /**
   * private constructor.
   */
  private Main() {
  }

  /**
   * main method in program.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    Alert alert = new SmallWindow();
    alert.create();
    alert.close();

    System.out.println("---------------------------");
    Menu menu = new BigWindow();
    menu.create();
    menu.submit();

    System.out.println("---------------------------");
    Alert adapter = new AlertAdapter(menu);
    adapter.create();
    adapter.close();

  }
}
