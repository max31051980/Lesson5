package it_academy.task3;

import java.util.Scanner;

public abstract class ATM implements Menu, ATMInformation, BanknotesQuantity {
    private int banknote20;
    private int banknote50;
    private int banknote100;
    private int balance = 0;
    private int anotherTransaction;
    private Scanner scan = new Scanner(System.in);

    @Override
    public void transaction(){
        int choice;
        System.out.println("Please select an option");
        System.out.println("1. Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        choice = scan.nextInt();
        switch (choice){
            case 1:
                System.out.println("You balance is " + balance);
                anotherTransaction();
                break;
            case 2:
                int amount;
                System.out.println("Please enter amount to withdraw. An amount must be a multiple of 20 and 50");
                amount = scan.nextInt();
                //proveryaem na polojitelnii balans
                if (amount > balance || amount == 0) {
                    System.out.println( "Sorry, You have insufficient funds");
                    anotherTransaction();
                }
                else if (amount % 50 % 20 != 0) {
                    System.out.println( "Sorry, An amount must be a multiple of 20 and 50" );
                }
                else{
                    banknote100 -= amount / 100;
                    banknote50 -= amount % 100 / 50;
                    banknote20 -= amount % 50 / 20;
                    balance = balance - amount;
                    System.out.println("You have withdrawn " + amount);
                    banknotesQuantity();
                    System.out.println("Your new balance is " + balance);
                    anotherTransaction();
                }
                break;
            case 3:
                int deposit;
                System.out.println("Please enter amount you would wish to deposit. An amount must be a multiple of 20 and 50");
                deposit = scan.nextInt();
                if (deposit % 50 % 20 != 0) {
                System.out.println( "Sorry, An amount must be a multiple of 20 and 50" );
                }
                else{
                balance += deposit;
                System.out.println("You have deposited " + deposit);
                banknotesQuantity();
                System.out.println("Your new balance is " + balance);
                anotherTransaction();
                }
                break;
            default:
                System.out.println("Invalid option\n");
                anotherTransaction();
                break;
        }
    }

    public void anotherTransaction(){
        System.out.println("Do you want another transaction? Press: \n1. Another transaction \n2. Exit");
        anotherTransaction = scan.nextInt();
        if (anotherTransaction == 1) {
            transaction();
        } else if (anotherTransaction == 2) {
            System.out.println( "Thanks for choosing our bank. Good Bye!" );
        }
        else {
            System.out.println("Invalid choice, please try again!\n");
            anotherTransaction();
        }
    }

    @Override
    public void banknotesQuantity() {
        System.out.println("Quantity of banknotes:");
        System.out.println("100 - " + banknote100 + " pieces");
        System.out.println("50 - " + banknote50 + " pieces");
        System.out.println("20 - " + banknote20 + " pieces");
    }
}