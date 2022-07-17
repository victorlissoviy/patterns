package classes;

import interfaces.Cabinet;

public final class OfficeCabinet implements Cabinet, Cloneable {
  /**
   * Cabinet name.
   */
  private String name;

  @Override
  public void setName(final String nameCabinet) {
    this.name = nameCabinet;
  }

  @Override
  public String getName() {
    return name;
  }

  /**
   * methot to get clone cabinet.
   * @return cabinet.
   */
  public Cabinet clone() {
    Cabinet cabinet = new OfficeCabinet();
    cabinet.setName("Name");
    return cabinet;
  }

  @Override
  public String toString() {
    return "OfficeCabinet{" + "name='" + name + '\'' + '}';
  }
}
