package content.worksplaces;

import interfaces.IWorkPlace;
import interfaces.IComputer;
import interfaces.IChair;
import interfaces.IPhone;
import interfaces.ITable;
import lombok.Builder;

/**
 * class for director workplace.
 */
@Builder
public final class DirectorWorkPlace implements IWorkPlace {
  /**
   * chair for director workplace.
   */
  private IChair chair;
  /**
   * table for director workplace.
   */
  private ITable table;
  /**
   * computer for director workplace.
   */
  private IComputer computer;
  /**
   * phone for director workplace.
   */
  private IPhone phone;

  @Override
  public void setChair(final IChair chairDirector) {
    this.chair = chairDirector;
  }

  @Override
  public void setComputer(final IComputer computerDirector) {
    this.computer = computerDirector;
  }

  @Override
  public void setPhone(final IPhone phoneDirector) {
    this.phone = phoneDirector;
  }

  @Override
  public void setTable(final ITable tableDirector) {
    this.table = tableDirector;
  }
}
