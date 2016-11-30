package de.rocketfox.spendings.Finance.Budget;

import java.util.ArrayList;

import de.rocketfox.spendings.Finance.Transaction.Transaction;

/**
 * Created by Lukas on 30.11.2016.
 */

public class Budget {
    private double amount;
    private String name;

    /**
     * Normal budget with an amount
     * @param amount Amount in the budget monthly
     */
    public Budget(double amount){
        this.amount = amount;
    }

    /**
     * Budget with name
     * @param name Name of the budget
     * @param amount Amount in the budget monthly
     */
    public Budget(String name, double amount){
        this.name = name;
        this.amount = amount;
    }


    public double leftInBudget(ArrayList<Transaction> transactions){
        double result = amount;
        for (Transaction tmpTrans:transactions
             ) {
            result =- tmpTrans.getAmount();
        }

        return result;
    }



}
