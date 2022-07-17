package classes;

import interfaces.Port;

import java.util.Random;

/**
 * Class for HDMI port.
 */
public final class HdmiPort implements Port {

  /**
   * Generation of HDMI port.
   */
  private int generation;

  /**
   * Get number generation of HDMI port.
   *
   * @return number generation.
   */
  public int getGeneration() {
    return generation;
  }

  /**
   * Set the number generation.
   *
   * @param generationNumber number generation.
   */
  public void setGeneration(final int generationNumber) {
    this.generation = generationNumber;
  }

  @Override
  public String plugin() {
    return "HDMI port plugin:\n\tgeneration: "
            + getGeneration();
  }

  /**
   * constructor for HDMI port.
   */
  public HdmiPort() {
    final int magicNUmber = 1000;
    setGeneration(new Random().nextInt(magicNUmber));
  }
}
