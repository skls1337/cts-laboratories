package cts.grecu.andy.g1092.factory;

public class JuniorAccount extends BankAccount {

	public JuniorAccount(double Balance, String Id) {
		super(Balance, Id);
	}

	@Override
	public String toString() {
		return "JuniorAccount [balance=" + balance + ", id=" + id + "]";
	}

	
	
}
