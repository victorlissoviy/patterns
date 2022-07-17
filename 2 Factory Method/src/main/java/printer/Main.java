package printer;

import printer.enums.PageTypes;
import printer.enums.PrintTypes;

public final class Main {
  /**
   * private constructor.
   */
  private Main() {
  }

  /**
   * @param args from console args.
   */
  public static void main(final String[] args) {
    Printer printer = new Printer();

    PageCreator pageCreator = new PageCreator();
    PrintConstructor printConstructor = new PrintConstructor();

    printer.setPage(pageCreator.createPage(PageTypes.A4));
    printer.setPrint(printConstructor.createPrint(PrintTypes.BLACKWHITE));

    System.out.println(printer);

  }
}
