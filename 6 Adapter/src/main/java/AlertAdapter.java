import interfaces.Alert;
import interfaces.Menu;

/**
 * class adapter for alert.
 */
public final class AlertAdapter implements Alert {
  /**
   * adapter constructor.
   */
  private final Menu menuAlert;

  /**
   * constructor for adapter.
   * @param menu menu for adapter.
   */
  public AlertAdapter(final Menu menu) {
    menuAlert = menu;
  }

  /**
   * create some alert.
   */
  @Override
  public void create() {
    menuAlert.create();
  }

  /**
   * close (submit) alert (Menu).
   */
  @Override
  public void close() {
    menuAlert.submit();
  }
}
