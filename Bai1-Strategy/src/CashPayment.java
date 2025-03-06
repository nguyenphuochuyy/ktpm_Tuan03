public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Bạn đã thanh toán  " + amount + " bằng tiền mặt");
    }
}
