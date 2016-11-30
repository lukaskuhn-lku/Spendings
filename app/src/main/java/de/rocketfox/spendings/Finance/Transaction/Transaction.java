package de.rocketfox.spendings.Finance.Transaction;

import java.util.Date;

/**
 * Created by Lukas on 30.11.2016.
 */

/**
 * BaseClass do not use
 */
public class Transaction {

    private String name;
    private double amount;

    Transaction(String name, double amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }






}
