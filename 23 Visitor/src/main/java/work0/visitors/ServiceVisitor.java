package work0.visitors;

import work0.services.FreeService;
import work0.services.PayableService;

public class ServiceVisitor implements Visitor {
  StringBuffer sb = new StringBuffer();

  @Override
  public void visit(FreeService service) {
    sb.append(service.getName());
    sb.append(" ");
  }

  @Override
  public void visit(PayableService service) {
    sb.append(service.getName());
    sb.append(" ");
  }

  @Override
  public String toString() {
    return sb.toString();
  }

  public void clear() {
    sb.delete(0, sb.length());
  }
}
