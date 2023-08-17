package main;

import java.util.Stack;

public class History {
  private final Stack<Snapshot> stack = new Stack<>();

  public History() {
  }

  public void addSnapshot(Snapshot snapshot) {
    stack.push(snapshot);
  }

  public Snapshot getPrev() {
    return stack.pop();
  }
}
