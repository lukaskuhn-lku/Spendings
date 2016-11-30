package de.rocketfox.spendings.Finance.Transaction;

/**
 * Created by Lukas on 30.11.2016.
 */

public class TransactionRecurring extends Transaction {

    private int recurringDay;

    TransactionRecurring(String name, double amount) {
        super(name, amount);
    }

    /**
     * Recurring transaction each month
     * @param name Reason of the transaction
     * @param amount Amount of the transaction
     * @param recurringDay Date of the month when it is recurring (INT)
     */
    TransactionRecurring(String name, double amount, int recurringDay){
        super(name, amount);
        recurringDay = recurringDay;
    }

    public int getRecurringDay() {
        return recurringDay;
    }

    public void setRecurringDay(int recurringDay) {
        this.recurringDay = recurringDay;
    }






}
