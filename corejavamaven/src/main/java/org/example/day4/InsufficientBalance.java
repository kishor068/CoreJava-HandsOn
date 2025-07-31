package org.example.day4;

public class InsufficientBalance extends Exception {
    public InsufficientBalance(){
        super("Balance Insufficient, your transaction is cancelled");
    }
}
