package work0.visitors;

import work0.services.FreeService;
import work0.services.PayableService;

public interface Visitor {
  void visit(FreeService service);
  void visit(PayableService service);
}
