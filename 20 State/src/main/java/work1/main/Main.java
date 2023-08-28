package work1.main;

import work1.signalSystems.SignalSystem;
import work1.states.StateOff;

public class Main {
  public static void main(String[] args) {
    SignalSystem ss = new SignalSystem();

    ss.message("test signal");

    ss.setState(new StateOff());

    ss.message("test signal 2");
  }
}
