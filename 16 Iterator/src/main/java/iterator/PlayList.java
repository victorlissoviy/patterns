package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for play list of song.
 */
public class PlayList {
  /**
   * List songs.
   */
  private final List<Song> songs;

  /**
   * Get iterator for list.
   *
   * @return song iterator.
   */
  public PlayListIterator iterator() {
    return new PlayListIterator(songs.toArray(Song[]::new));
  }

  /**
   * Simple constructor for list songs.
   */
  public PlayList() {
    songs = new ArrayList<>();
  }

  /**
   * Add new song in list.
   *
   * @param song song.
   */
  public void add(final Song song) {
    songs.add(song);
  }
}
