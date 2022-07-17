package decorators;

import interfaces.Port;
import lombok.NonNull;

import java.util.Random;

/**
 * Decorator for fast speed port.
 */
public final class FastSpeedPortDecorator implements Port {
  /**
   * Max speed of port.
   */
  private int speed;

  /**
   * Decorated port.
   */
  private Port port;

  @Override
  public String plugin() {
    return port.plugin() + "\n\tspeed: "
            + getSpeed();
  }

  /**
   * Get speed port.
   *
   * @return speed port.
   */
  public int getSpeed() {
    return speed;
  }

  /**
   * set speed port.
   *
   * @param speedPort port speed.
   */
  public void setSpeed(final int speedPort) {
    this.speed = speedPort;
  }

  /**
   * Get decorated port.
   *
   * @return decorated port.
   */
  public Port getPort() {
    return port;
  }

  /**
   * Set decorated port.
   *
   * @param decoratedPort decorated port.
   */
  public void setPort(@NonNull final Port decoratedPort) {
    this.port = decoratedPort;
  }

  /**
   * Decorator constructor.
   * @param decoratedPort decorated port.
   */
  public FastSpeedPortDecorator(final Port decoratedPort) {
    setPort(decoratedPort);
    final int magicNumber = 1000;
    setSpeed(new Random().nextInt(magicNumber));
  }
}
