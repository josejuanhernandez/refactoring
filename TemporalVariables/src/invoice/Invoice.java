package invoice;

public class Invoice {

    private int quantity;
    private double unitPrice;

    public Invoice(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        double price = quantity * unitPrice;
        double discount = 0;
        if (price >= 10) discount = price * 0.1;
        return price - discount;
    }

}
