package de.rocketfox.spendings.Finance.Transaction;

/**
 * Created by Lukas on 30.11.2016.
 */

public class TransactionOnce extends Transaction {

    /**
     * One Time Transaction
     * @param name Name of the transaction
     * @param amount Amount of the Transaction
     */
    TransactionOnce(String name, double amount) {
        super(name, amount);
    }

    //ATM only for Name reasons created

}
