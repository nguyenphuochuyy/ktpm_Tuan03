public class Order {
    private int orderID;
    private PaymentStage paymentStage;
    private double amount;


    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStage getPaymentStage() {
        return paymentStage;
    }

    public void setPaymentStage(PaymentStage paymentStage) {
        this.paymentStage = paymentStage;
    }

    public Order(int orderID, double amount, PaymentStage paymentStage) {
        this.orderID = orderID;
        this.amount = amount;
        this.paymentStage = paymentStage;
    }

    public Order(double amount , PaymentStage paymentStage) {
        this.amount = amount;
        this.paymentStage = paymentStage;
    }
    public Order(){

    }
    public Order(double amount) {
        this.amount = amount;
        this.paymentStage = new NotPaidStage();
    }
    public void pay(double amount) {
        paymentStage.pay(this, amount);
    }

    public void cancel() {
        paymentStage.cancel(this);
    }

}
