package cts.grecu.andy.g1092.command;

public abstract class BankModule {
    public abstract void processTransaction(String sourseAccount, String destinationAccount, double value,
            String destinationBank);
}