package printer;

import printer.enums.PrintTypes;
import printer.interfaces.Print;
import printer.print.BlackWhite;
import printer.print.Color;

/**
 * Print constructor.
 */
public class PrintConstructor {
  /**
   * @param type type of print.
   * @return new print type.
   */
  public Print createPrint(final PrintTypes type) {
    Print print;
    switch (type) {
      case BLACKWHITE:
        print = new BlackWhite();
        break;
      case COLOR:
        print = new Color();
        break;
      default:
        return null;
    }
    return print;
  }
}
