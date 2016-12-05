package case1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
    
    private double balance;
    private LocalDate lastTransactionDate;
    private ArrayList<Transaction> transactionList;

    public Account() {
		this.balance = 0;
		this.lastTransactionDate = null;
		this.transactionList = new ArrayList<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getLastTransactionDate() {
        return lastTransactionDate;
    }
    
    public void credit(double amount) {
        balance = balance - amount;
        LocalDate date = LocalDate.now();
        transactionList.add(new Transaction(date, -amount));
        lastTransactionDate = date;
    }

    public void debit(double amount) {
        balance = balance + amount;
        LocalDate date = LocalDate.now();
        transactionList.add(new Transaction(date, amount));
        lastTransactionDate = date;
    }

}
