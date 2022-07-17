package factories;

import content.worksplaces.DirectorWorkPlace;
import content.worksplaces.RegularWorkPlace;
import enums.WorkPlaceTypes;
import interfaces.IWorkPlace;
import interfaces.WorkPlaceFactory;

/**
 * class for create director workplace.
 */
public final class DirectorWorkPlaceFactory implements WorkPlaceFactory {

  @Override
  public IWorkPlace createWorkPlace(final WorkPlaceTypes workPlaceType) {
    IWorkPlace workPlace;
    switch (workPlaceType) {
      case REGULAR:
        workPlace = RegularWorkPlace.builder()
                .chair(new ChairFactory().createChair(workPlaceType))
                .table(new TableFactory().createTable(workPlaceType))
                .computer(new ComputerFactory().createComputer(workPlaceType))
                .phone(new PhoneFactory().createPhone(workPlaceType))
                .build();
        break;
      case DIRECTOR:
        workPlace = DirectorWorkPlace.builder()
                .chair(new ChairFactory().createChair(workPlaceType))
                .table(new TableFactory().createTable(workPlaceType))
                .computer(new ComputerFactory().createComputer(workPlaceType))
                .phone(new PhoneFactory().createPhone(workPlaceType))
                .build();
        break;
      default:
        return null;
    }
    return workPlace;
  }
}
