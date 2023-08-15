package work2.main;

import work2.interfaces.IMediator;
import work2.mediators.Mediator;
import work2.printers.Printer;

import java.util.Random;

public class Main {
  public static void main(String[] args) {
    IMediator mediator = new Mediator(new Printer(), new Printer(), new Printer());

    Random random = new Random();
    for(int i = 0; i < 15; i++) {
      int pages = random.nextInt(500);
      System.out.println("Send " + pages + " pages");
      mediator.addTask(pages);
      System.out.println();
    }
  }
}
