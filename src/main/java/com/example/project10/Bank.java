package com.example.project10;

public class Bank {
    public int balance;
    public String currency;

    // constructor
    public Bank(int balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    // method that changes properties values inside it
    public int usdToEur() {
        int amountInEur = (int) (balance * 0.98);
        System.out.println("Your " + balance + " " + currency + " equals " + amountInEur + " in EUR");
        balance = amountInEur; //changing properties inside the method
        currency = "EUR";
        return amountInEur;
    }

    // method that shows all the information about account (balance and currency)
    public void printAccountInfo() {
        System.out.println("You've got " + balance + " " + currency + " on your bank account");
    }
}
