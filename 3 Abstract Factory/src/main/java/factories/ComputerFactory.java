package factories;

import content.computers.DirectorComputer;
import content.computers.RegularComputer;
import enums.WorkPlaceTypes;
import interfaces.IComputer;

/**
 * class factory for create computer.
 */
public final class ComputerFactory {
  /**
   * create computer.
   * @param workPlaceType type of work place to create a computer.
   * @return computer.
   */
  IComputer createComputer(final WorkPlaceTypes workPlaceType) {
    IComputer computer;
    switch (workPlaceType) {
      case REGULAR:
        computer = new RegularComputer();
        break;
      case DIRECTOR:
        computer = new DirectorComputer();
        break;
      default:
        return null;
    }
    return computer;
  }
}
