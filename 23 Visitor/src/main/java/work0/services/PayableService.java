package work0.services;

import work0.visitors.Visitor;

public class PayableService implements Service {
  private final String name;

  public PayableService(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
