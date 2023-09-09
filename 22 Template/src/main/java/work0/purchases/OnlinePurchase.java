package work0.purchases;

public class OnlinePurchase extends Purchase {
  @Override
  protected void placeOrder() {
    System.out.println("Виконання покупки");
  }

  @Override
  protected void checkAvailability() {
    System.out.println("Перевірка покупки");
  }

  @Override
  protected void initPurchasing(String user) {
    System.out.println("Ініціалізація покупки користувачем: " + user);
  }
}
