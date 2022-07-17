package databaseconnector;

import java.io.Serializable;

/**
 * Class for database connect.
 */
public final class DatabaseConnector implements Serializable {
  /**
   * get database name.
   *
   * @return database name.
   */
  public String getDatabaseName() {
    return databaseName;
  }

  /**
   * set database name.
   *
   * @param name database name.
   */
  public void setDatabaseName(final String name) {
    this.databaseName = name;
  }

  /**
   * Name of database.
   */
  private String databaseName;
  /**
   * only one instance for connect.
   */
  private static DatabaseConnector databaseConnector;

  /**
   * private constructor for database connector.
   */
  private DatabaseConnector() {
  }

  /**
   * get instance database connector.
   *
   * @param name database name.
   * @return database connector.
   */
  public static synchronized DatabaseConnector getInstance(final String name) {
    if (databaseConnector == null) {
      databaseConnector = new DatabaseConnector();
      databaseConnector.setDatabaseName(name);
    }
    return databaseConnector;
  }

  /**
   * method go around serializable.
   *
   * @return database connector.
   */
  private Object readResolve() {
    return databaseConnector;
  }

  /**
   * Main method in program.
   *
   * @param args console args.
   */
  public static void main(final String[] args) {
    DatabaseConnector databaseConnector1 = DatabaseConnector
            .getInstance("database");
    System.out.println(databaseConnector1.getDatabaseName());
    DatabaseConnector databaseConnector2 = DatabaseConnector
            .getInstance("adasdasd");
    System.out.println(databaseConnector2.getDatabaseName());

  }
}
