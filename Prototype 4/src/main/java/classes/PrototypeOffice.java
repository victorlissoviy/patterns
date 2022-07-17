package classes;

import interfaces.Office;
import interfaces.Room;

public final class PrototypeOffice implements Office, Cloneable {
  /**
   * Office name.
   */
  private String name;

  /**
   * Room in Office.
   */
  private Room room;

  @Override
  public void setName(final String nameOfiice) {
    this.name = nameOfiice;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setRoom(final Room roomOffice) {
    this.room = roomOffice;
  }

  @Override
  public Room getRoom() {
    return room;
  }

  /**
   * Method to get clone of Office.
   * @return office.
   */
  public Office clone() {
    PrototypeOffice office = new PrototypeOffice();
    office.setName("Name");
    office.setRoom(((OfficeRoom) room).clone());
    return office;
  }

  @Override
  public String toString() {
    return "PrototypeOffice{" + "name='" + name + '\'' + ", room=" + room + '}';
  }
}
