package factories;

import content.phones.DirectorPhone;
import content.phones.RegularPhone;
import enums.WorkPlaceTypes;
import interfaces.IPhone;

/**
 * class factory for create phone.
 */
public final class PhoneFactory {
  /**
   * create phone.
   * @param workPlaceType type of work place to create a phone.
   * @return phone.
   */
  public IPhone createPhone(final WorkPlaceTypes workPlaceType) {
    IPhone phone;
    switch (workPlaceType) {
      case REGULAR:
        phone = new RegularPhone();
        break;
      case DIRECTOR:
        phone = new DirectorPhone();
        break;
      default:
        return null;
    }
    return phone;
  }
}
