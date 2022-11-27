package com.gio;

public class Main {
    public static void main(String[] args) {
        Account giosAccount = new Account("Gio");
        giosAccount.deposit(1000);
        giosAccount.withdraw(500);
        giosAccount.withdraw(-500);
        giosAccount.deposit(-20);
        giosAccount.calculateBalance();

        System.out.println("Balance on account is " + giosAccount.getBalance());
        giosAccount.calculateBalance();

    }
}
