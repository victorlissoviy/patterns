package work0.services;

import work0.visitors.Visitor;

public interface Service {
  String getName();

  void accept(Visitor visitor);
}
