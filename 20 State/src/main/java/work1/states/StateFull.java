package work1.states;

import work1.states.interfaces.State;

public class StateFull extends State {

  public StateFull() {
    System.out.println("Enabled full signal state");
  }

  @Override
  public void signal(String message) {
    System.out.println("Full state messge: " + message);
  }
}
