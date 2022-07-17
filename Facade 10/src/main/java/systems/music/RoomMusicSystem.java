package systems.music;

import systems.music.interfaces.MusicSystem;

/**
 * Class music system for room.
 */
public final class RoomMusicSystem implements MusicSystem {
  /**
   * volume level music system.
   */
  private int volume = MusicSystem.VOLUME;

  @Override
  public void on() {
    System.out.println("Room music on");
  }

  @Override
  public void off() {
    System.out.println("Room music off");
  }

  @Override
  public void adjustVolume(final int volumeLevel) {
    setVolume(volumeLevel);
  }

  /**
   * Get volume level.
   *
   * @return volume level.
   */
  public int getVolume() {
    return volume;
  }

  /**
   * Set volume level.
   *
   * @param volumeLevel new volume level (0 - 100).
   */
  public void setVolume(final int volumeLevel) {
    final int maxVolume = 100;
    if (volumeLevel >= 0 && volumeLevel <= maxVolume) {
      this.volume = volumeLevel;
    }
    System.out.println("Volume level is " + getVolume());
  }
}
