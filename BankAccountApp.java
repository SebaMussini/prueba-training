package com.oop;

public class BankAccountApp {

    public static void main (String[] args) {

        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "465456464";
        // acc1.name = "Roger Sue";


        // With Encapsulation: public API methods
        // Encapsulation is all about hiding
        acc1.setName("Roger Sue");
        System.out.println(acc1.getName());

        acc1.setSsn("54561651");
        System.out.println("SSN is: " + acc1.getSsn());

        acc1.accountNumber = "446526";

        acc1.balance = 10000;

        acc1.setRate();
        acc1.increaseRate();

        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.withdraw(2000);



        // Polymorphism through overriding
        System.out.println(acc1.toString());




        /*

        BankAccount acc2 = new BankAccount("Checking account");
        BankAccount acc3 = new BankAccount("Saving account", 5000);

        System.out.println(acc1.routingNumber);
        System.out.println(acc2.routingNumber);
        System.out.println(acc3.routingNumber);

        acc3.checkBalance();






        /*


        // Demo for inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "Juan";
        cd1.accountType = "CD Account";
        // estamos llamando al método  toString de nuestra clase BankAccount, pues lo   @Override   it
        System.out.println(cd1.toString());
        cd1.compount();
        */






    }

}
