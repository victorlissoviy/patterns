package work1.states;

import work1.states.interfaces.State;

public class StateOff extends State {

  public StateOff() {
    System.out.println("Signal system off");
  }
  @Override
  public void signal(String message) {
    System.out.println("Message ignored (State off)");
  }
}
