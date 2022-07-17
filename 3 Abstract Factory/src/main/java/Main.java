import enums.WorkPlaceTypes;
import factories.DirectorWorkPlaceFactory;
import interfaces.IWorkPlace;
import interfaces.WorkPlaceFactory;

/**
 * main class of program.
 */
public final class Main {
  private Main() {
  }

  /**
   * main method.
   * @param args from command line arguments
   */
  public static void main(final String[] args) {
    WorkPlaceTypes workPlaceType = WorkPlaceTypes.DIRECTOR;
    WorkPlaceFactory workPlaceFactory = new DirectorWorkPlaceFactory();
    IWorkPlace workPlace = workPlaceFactory.createWorkPlace(workPlaceType);
    System.out.println(workPlace);
  }
}
