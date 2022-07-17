package interfaces;

/**
 * interface for office.
 */
public interface Office {
  /**
   * set office name.
   *
   * @param name office name.
   */
  void setName(String name);

  /**
   * get office name.
   *
   * @return office name.
   */
  String getName();

  /**
   * set new room.
   *
   * @param room new room.
   */
  void setRoom(Room room);

  /**
   * get room.
   *
   * @return room.
   */
  Room getRoom();
}
