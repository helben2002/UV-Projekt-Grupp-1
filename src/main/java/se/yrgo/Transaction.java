package se.yrgo;

import java.time.LocalDateTime;
import java.time.format.*;

public class Transaction {
    
    private String type;
    private double amount;
    private String dateTime;

    public Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return String.format("%s    %.2f    %s", type, amount, dateTime);

    }
}
