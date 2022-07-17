package dinner;

import soup.ingredients.Soup;

/**
 * Main class for program.
 */
public final class Dinner {
  private Dinner() {
  }

  /**
   * @param args std in
   */
  public static void main(final String[] args) {
    Soup.Builder builder = new Soup.Builder();
    Soup soup = builder.getSoup();

    System.out.println(soup);
  }
}
