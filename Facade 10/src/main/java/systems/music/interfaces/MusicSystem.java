package systems.music.interfaces;

/**
 * Interface for music systems.
 */
public interface MusicSystem {
  /**
   * default volume level.
   */
  int VOLUME = 50;

  /**
   * Music on.
   */
  void on();

  /**
   * Music off.
   */
  void off();

  /**
   * Set volume on music system.
   *
   * @param volume volume level (0 - 100).
   */
  void adjustVolume(int volume);
}
