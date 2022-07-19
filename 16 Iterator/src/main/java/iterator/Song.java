package iterator;

/**
 * Class for song.
 */
public class Song {
  /**
   * Name of song.
   */
  private final String name;

  /**
   * Constructor for song.
   *
   * @param nameSong name song.
   */
  public Song(final String nameSong) {
    this.name = nameSong;
  }

  /**
   * Get string line from song.
   *
   * @return string line.
   */
  @Override
  public String toString() {
    return "Song{" + "name='" + name + '\'' + '}';
  }
}
