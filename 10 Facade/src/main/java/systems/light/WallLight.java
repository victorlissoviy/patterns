package systems.light;

import systems.light.interfaces.LightSystem;

/**
 * Class for wall light system.
 */
public final class WallLight implements LightSystem {
  @Override
  public void on() {
    System.out.println("Wall light on");
  }

  @Override
  public void off() {
    System.out.println("Wall light off");
  }

  @Override
  public void dim() {
    System.out.println("Wall light dim");
  }
}
