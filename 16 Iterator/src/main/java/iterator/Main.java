package iterator;

/**
 * Main class.
 */
public final class Main {
  /**
   * Constructor for main.
   */
  private Main() {
  }

  /**
   * Main method.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    PlayList playList = new PlayList();
    playList.add(new Song("song1"));
    playList.add(new Song("song2"));
    playList.add(new Song("song3"));
    playList.add(new Song("song4"));

    PlayListIterator iterator = playList.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
