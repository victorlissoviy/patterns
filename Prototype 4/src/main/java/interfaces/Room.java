package interfaces;

/**
 * interface for room.
 */
public interface Room {
  /**
   * set room name.
   *
   * @param name name of room.
   */
  void setName(String name);

  /**
   * method for get name.
   *
   * @return name of room.
   */
  String getName();

  /**
   * set the cabinet.
   *
   * @param cabinet cabinet.
   */
  void setCabinet(Cabinet cabinet);

  /**
   * get cabinet.
   *
   * @return cabinet.
   */
  Cabinet getCabinet();
}
