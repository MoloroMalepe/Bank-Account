package com;


import com.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

BankAccount objBankAcc=new BankAccount(123456789,0.0);
        System.out.println("The account number is: "+objBankAcc.getAccNumber());


        double depAmount;

        while(true){
            System.out.println("Enter amount to deposit: ");
          if(input.hasNextDouble()) {

              depAmount = input.nextDouble();

              if (depAmount > 0) {
                  objBankAcc.deposit(depAmount);
                  break;
              } else
                  System.out.println("Enter the valid deposit amount, must be greater than zero.");
          }
          else {
              System.out.println("Enter a valid amount ");
              input.next();
          }

        }

        System.out.println("The deposited amount to bank acc no " + objBankAcc.getAccNumber() +
                " is R" + depAmount);
        System.out.println("The balance is now: R" + objBankAcc.getBalance());



        //wiythdrawal

        double withdrawalAmnt;
        while (true){
            if (input.hasNextDouble()){
                System.out.println("Enter the withdrawal amount: ");
                withdrawalAmnt= input.nextDouble();
                if (withdrawalAmnt>0){
                    objBankAcc.withdraw(withdrawalAmnt);
                    break;
                }
                else System.out.println("Enter the valid amount, must be greater than 0.");
            }
            else {
                System.out.println("Enter a valid withdrawal amount.");
                input.next();
            }
        }

        System.out.println("The deposited amount to bank acc no " + objBankAcc.getAccNumber() +
                " is R" + withdrawalAmnt);
        System.out.println("The balance is now: R" + objBankAcc.getBalance());



    }
}