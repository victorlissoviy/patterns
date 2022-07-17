package printer;

import printer.enums.PageTypes;
import printer.interfaces.Page;
import printer.pages.A3;
import printer.pages.A4;
import printer.pages.A5;

/**
 * Class for create pages.
 */
public class PageCreator {
  /**
   * @param pageTypes type of page.
   * @return new Page.
   */
  public Page createPage(final PageTypes pageTypes) {
    Page page;
    switch (pageTypes) {
      case A3:
        page = new A3();
        break;
      case A4:
        page = new A4();
        break;
      case A5:
        page = new A5();
        break;
      default:
        return null;
    }
    return page;
  }
}
