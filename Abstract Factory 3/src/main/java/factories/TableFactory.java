package factories;

import content.tables.DirectorTable;
import content.tables.RegularTable;
import enums.WorkPlaceTypes;
import interfaces.ITable;

/**
 * class factory for create table.
 */
public final class TableFactory {
  /**
   * create table.
   * @param workPlaceType type of work place to create a table.
   * @return table.
   */
  public ITable createTable(final WorkPlaceTypes workPlaceType) {
    ITable table;
    switch (workPlaceType) {
      case REGULAR:
        table = new RegularTable();
        break;
      case DIRECTOR:
        table = new DirectorTable();
        break;
      default:
        return null;
    }
    return table;
  }
}
