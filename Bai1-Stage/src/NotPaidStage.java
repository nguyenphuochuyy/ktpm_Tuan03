public class NotPaidStage implements PaymentStage{
    @Override
    public void pay(Order order, double amount) {
        System.out.println("Khởi tạo thanh toán cho Order " + order.getOrderID());
        order.setPaymentStage(new CashStage());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order chưa được thanh toán , không có gì để hủy");
    }
}
