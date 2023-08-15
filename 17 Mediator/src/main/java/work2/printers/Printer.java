package work2.printers;

import lombok.Getter;
import work2.interfaces.IMediator;

public class Printer {
  private final int sizePages;
  private int printPages;
  @Getter
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  @Getter
  private IMediator mediator;

  public Printer() {
    sizePages = 1000;
    printPages = 0;
  }

  public void setMediator(IMediator mediator) {
    this.mediator = mediator;
  }

  public void newPrint(int countPages) {
    int currentPages = sizePages - printPages;

    if (currentPages > countPages) {
      printPages += countPages;
      System.out.println("Printer " + getName() + " printed " + countPages + " pages\nleft " + (sizePages - printPages) + " pages");
    } else {
      System.out.println("Printer " + getName() + " printed " + currentPages + " pages\nleft 0 pages");
      countPages -= currentPages;
      printPages += currentPages;
      mediator.addTask(countPages);
    }
  }

  public boolean isEmpty() {
    return sizePages <= printPages;
  }

  public int getFreePages() {
    return sizePages - printPages;
  }

}
