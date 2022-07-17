package classes;

import interfaces.Cabinet;
import interfaces.Room;

public final class OfficeRoom implements Room, Cloneable {
  /**
   * Room name.
   */
  private String name;
  /**
   * Cabinet in room.
   */
  private Cabinet cabinet;

  @Override
  public void setName(final String nameRoom) {
    this.name = nameRoom;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setCabinet(final Cabinet cabinetInRoom) {
    this.cabinet = cabinetInRoom;
  }

  @Override
  public Cabinet getCabinet() {
    return cabinet;
  }

  /**
   * Method to get clone of room.
   * @return room.
   */
  public Room clone() {
    OfficeRoom room = new OfficeRoom();
    room.setName("Name");
    room.setCabinet(((OfficeCabinet) cabinet).clone());
    return room;
  }

  @Override
  public String toString() {
    return "OfficeRoom{" + "name='" + name + '\''
            + ", cabinet=" + cabinet + '}';
  }
}
