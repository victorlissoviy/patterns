package facades;

import lombok.Builder;
import lombok.Setter;
import systems.light.interfaces.LightSystem;
import systems.music.interfaces.MusicSystem;

/**
 * Class for control smart home.
 */
@Setter
@Builder
public final class SmartHouseController {
  /**
   * Control light system.
   */
  private LightSystem lightSystem;
  /**
   * control music system.
   */
  private MusicSystem musicSystem;

  /**
   * Turn on all in house.
   */
  public void on() {
    lightSystem.on();
    musicSystem.on();
  }

  /**
   * Turn off all in house.
   */
  public void off() {
    lightSystem.off();
    musicSystem.off();
  }

  /**
   * All lights set the night lights.
   */
  public void night() {
    final int nightVolume = 10;
    lightSystem.dim();
    musicSystem.adjustVolume(nightVolume);
  }
}
