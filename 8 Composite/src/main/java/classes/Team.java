package classes;

import interfaces.Organization;

/**
 * Class team organization.
 */
public final class Team extends Organization {
  /**
   * Group in team.
   */
  private Group group;

  @Override
  public void print() {
    System.out.println(getName() + " have type " + getType());
    if (getGroup() != null) {
      getGroup().print();
    }
  }

  /**
   * @return Group in team.
   */
  public Group getGroup() {
    return group;
  }

  /**
   * @param groupTeam Group in team.
   */
  public void setGroup(final Group groupTeam) {
    this.group = groupTeam;
  }
}
