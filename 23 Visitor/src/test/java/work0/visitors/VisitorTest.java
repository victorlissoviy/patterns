package work0.visitors;

import org.junit.jupiter.api.Test;
import work0.services.FreeService;
import work0.services.PayableService;
import work0.services.Service;

import static org.junit.jupiter.api.Assertions.*;

class VisitorTest {

  @Test
  void visitTest() {
    ServiceVisitor visitor = new ServiceVisitor();

    Service s1 = new FreeService("Free Service");
    Service s2 = new PayableService("Payable Service");

    visitor.clear();
    s1.accept(visitor);
    s2.accept(visitor);

    System.out.println(visitor);

    assertTrue(true);
  }
}