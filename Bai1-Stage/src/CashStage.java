public class CashStage implements PaymentStage{
    @Override
    public void pay(Order order, double amount) {
        System.out.println("Đã trả bằng tiền mặt");

    }

    @Override
    public void cancel(Order order) {
        System.out.println("Đã hủy thanh toán cho Order " + order.getOrderID());
        order.setPaymentStage(new NotPaidStage());
    }
}
