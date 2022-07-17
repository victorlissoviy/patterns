package systems.music;

import systems.music.interfaces.MusicSystem;

/**
 * Class for kitchen music system.
 */
public final class KitchenMusicSystem implements MusicSystem {
  /**
   * volume level.
   */
  private int volume = MusicSystem.VOLUME;

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
   * @param volumeLevel volume level (0 - 100).
   * @return changed volume.
   */
  public boolean setVolume(final int volumeLevel) {
    final int maxVolume = 100;
    if (volumeLevel >= 0 && volumeLevel <= maxVolume) {
      this.volume = volumeLevel;
      return true;
    }
    return false;
  }

  @Override
  public void on() {
    System.out.println("Kitchen music on");
  }

  @Override
  public void off() {
    System.out.println("Kitchen music off");
  }

  @Override
  public void adjustVolume(final int volumeLevel) {
    if (!setVolume(volumeLevel)) {
      throw new RuntimeException("Volume ("
              + volumeLevel + ") is not in from 0 to 100");
    }
    System.out.println("Volume level is " + getVolume());
  }
}
