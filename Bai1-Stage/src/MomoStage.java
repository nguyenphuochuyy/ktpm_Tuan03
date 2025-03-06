public class MomoStage implements PaymentStage{
    @Override
    public void pay(Order order, double amount) {
        System.out.println("Thanh toán Order bằng banking tổng = " + amount );
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Đã hủy thanh toán bằng banking");
        order.setPaymentStage(new NotPaidStage());
    }
}
