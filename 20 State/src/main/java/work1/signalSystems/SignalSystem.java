package work1.signalSystems;

import lombok.Getter;
import work1.states.StateFull;
import work1.states.interfaces.State;

@Getter
public class SignalSystem {
  private State state;

  public SignalSystem() {
    setState(new StateFull());
  }

  public void setState(State state) {
    this.state = state;
  }

  public void message(String message) {
    getState().signal(message);
  }
}
