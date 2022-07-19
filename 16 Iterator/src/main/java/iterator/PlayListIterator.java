package iterator;

/**
 * class for play list iterator.
 */
public class PlayListIterator {
  /**
   * Song list.
   */
  private final Song[] songs;
  /**
   * position in list songs.
   */
  private int position;

  /**
   * Try to get next element.
   *
   * @return exist next element.
   */
  public boolean hasNext() {
    return position < songs.length;
  }

  /**
   * Simple constructor.
   *
   * @param songsList list songs.
   */
  public PlayListIterator(final Song[] songsList) {
    this.songs = songsList;
  }

  /**
   * Get next element.
   *
   * @return next song.
   */
  public Song next() {
    Song song = songs[position];
    position++;
    return song;
  }
}
