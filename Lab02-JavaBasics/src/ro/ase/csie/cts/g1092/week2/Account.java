package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exceptions.InsuficientFundsException;

public abstract class Account {
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void transfer(Account destination,double amount) throws InsuficientFundsException, IllegalTransferException;
	public abstract void withdraw(double amount) throws InsuficientFundsException;
	
}
