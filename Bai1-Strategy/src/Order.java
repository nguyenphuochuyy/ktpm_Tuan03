public class Order {
    private int orderID;
    private PaymentStrategy paymentStrategy;
    private double amount;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public Order(double amount)
    {
        this.amount = amount;
        this.paymentStrategy = new CashPayment();
    }
    public Order(){

    }
    public void setAmount(double amount) {
    this.amount = amount;

    }

    public void processPayment() {
        paymentStrategy.pay(amount);
    }
}
