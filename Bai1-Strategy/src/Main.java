public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setAmount(2000);
        order.setPaymentStrategy(new BankingPayment("36363636"));
        order.processPayment();
    }
}