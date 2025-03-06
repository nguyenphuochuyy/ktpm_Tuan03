public class BankingPayment implements PaymentStrategy {
    private String accountNumber;
    public BankingPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Bạn đã thanh toán " + amount + "bằng chuyển khoản ngân hàng");
    }
}
