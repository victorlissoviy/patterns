package content.worksplaces;

import interfaces.IWorkPlace;
import interfaces.IChair;
import interfaces.ITable;
import interfaces.IComputer;
import interfaces.IPhone;
import lombok.Builder;

/**
 * class for regular work place.
 */
@Builder
public final class RegularWorkPlace implements IWorkPlace {
  /**
   * chair for regular workplace.
   */
  private IChair chair;
  /**
   * table for regular workplace.
   */
  private ITable table;
  /**
   * computer for regular workplace.
   */
  private IComputer computer;
  /**
   * phone for regular workplace.
   */
  private IPhone phone;

  @Override
  public void setChair(final IChair chairRegular) {
    this.chair = chairRegular;
  }

  @Override
  public void setComputer(final IComputer computerRegular) {
    this.computer = computerRegular;
  }

  @Override
  public void setPhone(final IPhone phoneRegular) {
    this.phone = phoneRegular;
  }

  @Override
  public void setTable(final ITable tableRegular) {
    this.table = tableRegular;
  }
}
