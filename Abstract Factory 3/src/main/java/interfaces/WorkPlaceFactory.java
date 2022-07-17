package interfaces;

import enums.WorkPlaceTypes;

/**
 * interface for workplace factory.
 */
public interface WorkPlaceFactory {
  /**
   *
   * @param workPlaceType type of work place to create work place.
   * @return work place.
   */
  IWorkPlace createWorkPlace(WorkPlaceTypes workPlaceType);

}
