package com;

public class BankAccount {
    private  long accNumber;
    private double balance;

    public BankAccount(long accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public long getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(long accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){

            this.balance += amount;
        }



    public  void withdraw(double withdralAmnt){

        balance=balance-withdralAmnt;

    }
}
