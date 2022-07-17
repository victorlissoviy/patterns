package demo;

import facades.SmartHouseController;
import systems.light.WallLight;
import systems.music.KitchenMusicSystem;

/**
 * Main package.
 *
 * @author victor
 * @version 1.0
 */
public final class Main {
  /**
   * private constructor.
   */
  private Main() {
  }

  /**
   * Main method.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    SmartHouseController smartHouseController = SmartHouseController.builder()
            .musicSystem(new KitchenMusicSystem())
            .lightSystem(new WallLight())
            .build();

    smartHouseController.on();
    System.out.println();
    smartHouseController.night();
    System.out.println();
    smartHouseController.off();
  }
}
