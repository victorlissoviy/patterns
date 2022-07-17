package factories;

import content.chairs.DirectorChair;
import content.chairs.RegularChair;
import enums.WorkPlaceTypes;
import interfaces.IChair;

/**
 * class factory for create chairs.
 */
public final class ChairFactory {
  /**
   * create chair.
   * @param workPlaceType type of work place to create a chair.
   * @return chair.
   */
  IChair createChair(final WorkPlaceTypes workPlaceType) {
    IChair chair = null;
    switch (workPlaceType) {
      case REGULAR:
        chair = new RegularChair();
        break;
      case DIRECTOR:
        chair = new DirectorChair();
        break;
      default:
        return null;
    }
    return chair;
  }
}
