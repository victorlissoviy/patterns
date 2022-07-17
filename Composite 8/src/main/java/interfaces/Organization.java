package interfaces;

/**
 * class for organizate team and group.
 */
public abstract class Organization {
  /**
   * name of organization.
   */
  private String name;
  /**
   * type of organization.
   */
  private String type;

  /**
   * @return type organization.
   */
  public String getType() {
    return type;
  }

  /**
   * @param typeOrganization organization type.
   */
  public void setType(final String typeOrganization) {
    this.type = typeOrganization;
  }

  /**
   * @return organization name.
   */
  public String getName() {
    return name;
  }

  /**
   * @param nameOrganization Organization name.
   */
  public void setName(final String nameOrganization) {
    this.name = nameOrganization;
  }

  /**
   * Print name and type organization.
   */
  public abstract void print();
}
