package com.oop;

// if i want to inheritance the object class of BankAccount in CDAccount class, i must extend it

public class CDAccount extends  BankAccount {

    String interestRate;

    void compount () {
        System.out.println("Compounding interest");
    }
}
