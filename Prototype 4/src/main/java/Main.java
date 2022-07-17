import classes.OfficeCabinet;
import classes.OfficeRoom;
import classes.PrototypeOffice;
import interfaces.Cabinet;
import interfaces.Office;
import interfaces.Room;

/**
 * Main class of program.
 */
public final class Main {
  private Main() {
  }

  /**
   * Main method in program.
   *
   * @param args console arguments.
   */
  public static void main(final String[] args) {
    Cabinet cabinet = new OfficeCabinet();
    cabinet.setName("cabinet");

    Room room = new OfficeRoom();
    room.setName("Room");
    room.setCabinet(cabinet);

    Office office = new PrototypeOffice();
    office.setName("Office");
    office.setRoom(room);

    System.out.println(office);
    System.out.println(((PrototypeOffice) office).clone());
  }
}
