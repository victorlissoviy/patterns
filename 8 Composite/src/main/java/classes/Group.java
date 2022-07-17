package classes;

import interfaces.Organization;

/**
 * Class for group organization.
 */
public final class Group extends Organization {
  /**
   * Team in group.
   */
  private Team team;

  @Override
  public void print() {
    System.out.println(getName() + " have type " + getType());
    if (getTeam() != null) {
      getTeam().print();
    }
  }

  /**
   * @return team in group.
   */
  public Team getTeam() {
    return team;
  }

  /**
   * @param teamGroup set team in group.
   */
  public void setTeam(final Team teamGroup) {
    this.team = teamGroup;
  }
}
