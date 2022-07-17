package printer;

import printer.interfaces.Page;
import printer.interfaces.Print;

/**
 * Main class of program.
 */
public final class Printer {
  /**
   * constructor.
   */
  public Printer() {
  }

  /**
   * @param newPage Printer Page.
   */
  public void setPage(final Page newPage) {
    this.page = newPage;
  }

  /**
   * Printer page.
   */
  private Page page;

  /**
   * Set new print.
   *
   * @param printNew new print.
   */
  public void setPrint(final Print printNew) {
    this.print = printNew;
  }

  /**
   * Print.
   */
  private Print print;

  @Override
  public String toString() {
    return "Printer{" + "page=" + page + ", print=" + print + '}';
  }
}
