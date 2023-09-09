package work0.purchases;

public abstract class Purchase {
  public void buy(String user) {
    initPurchasing(user);
    checkAvailability();
    placeOrder();
  }

  protected abstract void placeOrder();

  protected abstract void checkAvailability();

  protected abstract void initPurchasing(String user);
}
