package work2.mediators;

import work2.interfaces.IMediator;
import work2.printers.Printer;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator {
  private final List<Printer> printerList = new ArrayList<>();

  public Mediator(Printer... printers) {
    for (Printer printer : printers) {
      addPrinter(printer);
    }
  }

  @Override
  public void addTask(int countPages) {
    System.out.println("get " + countPages + " pages for print");
    int index = getMostFreePrinter();

    if (index == -1) {
      System.out.println("Printers empty");
    } else {
      printerList.get(index).newPrint(countPages);
    }

  }

  private int getMostFreePrinter() {
    int index = -1;
    int max = -1;//printerList.get(0).getFreePages();

    for (int i = 0; i < printerList.size(); i++) {
      if (printerList.get(i).isEmpty()) {
        continue;
      }

      int currentFreePages = printerList.get(i).getFreePages();
      if (max < currentFreePages) {
        max = currentFreePages;
        index = i;
      }
    }

    return index;
  }

  @Override
  public void addPrinter(Printer printer) {
    if (printer.getName() == null || printer.getName().isEmpty()) {
      printer.setName("pr" + printerList.size());
    }
    if (printer.getMediator() == null) {
      printer.setMediator(this);
    }
    printerList.add(printer);
  }

}
