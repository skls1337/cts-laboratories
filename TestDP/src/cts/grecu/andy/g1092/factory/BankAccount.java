package cts.grecu.andy.g1092.factory;

public abstract class BankAccount {
    double balance;
    String id;

    public BankAccount(double Balance, String Id) {
        balance = Balance;
        id = Id;
    }
}