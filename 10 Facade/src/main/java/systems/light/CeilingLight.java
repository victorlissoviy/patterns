package systems.light;

import systems.light.interfaces.LightSystem;

/**
 * Class for ceiling light system.
 */
public final class CeilingLight implements LightSystem {
  @Override
  public void on() {
    System.out.println("Ceiling light on");
  }

  @Override
  public void off() {
    System.out.println("Ceiling light off");
  }

  @Override
  public void dim() {
    System.out.println("Ceiling light dim");
  }
}
