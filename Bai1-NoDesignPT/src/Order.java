public class Order {
    private int id;
    private String payment;

    public Order(String payment, int id) {
        this.payment = payment;
        this.id = id;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }
    public String getPayment() {
        return payment;
    }
    public void setPayment(String payment) {
        this.payment = payment;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String pay(String payment){
        String pm = "";
        if(payment == "cash"){
            pm = "Cash";
        } else if (payment == "banking") {
            pm = "Banking";
        }
        else if(payment == "momo") {
            pm = "Momo";
        }
        else {
            pm = "Unknown";
        }
        return pm;
    }
}
