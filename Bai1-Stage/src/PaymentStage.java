public interface PaymentStage {
    void pay(Order order , double amount);
    void cancel(Order order);
}
