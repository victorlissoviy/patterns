package demo;

import classes.Group;
import classes.Team;

/**
 * Main class.
 */
public final class Main {
  /**
   * Main constructor.
   */
  private Main() {
  }

  /**
   * Main method.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    Group group = new Group();
    Team team = new Team();

    team.setGroup(group);

    team.print();
  }
}
