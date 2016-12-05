package case1;

import java.time.LocalDate;

public class Transaction {

    private final LocalDate date;
    private final double amount;

    public Transaction(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }
}
