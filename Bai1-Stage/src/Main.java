public class Main {
    public static void main(String[] args) {
        Order order = new Order(2000);
        order.pay(2000);
        order.pay(2000);
        order.cancel();
    }
}