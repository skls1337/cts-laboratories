package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exceptions.InsuficientFundsException;

public class CurrentAccount  extends BankAccount{
public static final double MAX_CREDIT=5000;
	public CurrentAccount( String iban) {
		super(MAX_CREDIT, iban);
		
	}

	@Override
	public void deposit(double amount) {
		this.balance+=amount;
		
	}

	@Override
	public void transfer(Account destination, double amount) throws InsuficientFundsException, IllegalTransferException {
		if(this==destination) {
			throw new IllegalTransferException();
		}
		this.withdraw(amount);
		destination.deposit(amount);
		
	}

	@Override
	public void withdraw(double amount) throws InsuficientFundsException {
		if(amount>this.balance) {
			throw new InsuficientFundsException("You don't have enough ammount");
		}else {
			this.balance-=amount;
		}
		
	}

}
