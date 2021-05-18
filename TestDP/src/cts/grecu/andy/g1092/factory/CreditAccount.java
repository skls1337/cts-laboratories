package cts.grecu.andy.g1092.factory;

public class CreditAccount extends BankAccount{

	private double creditLimit;
	private int noInstallments;
	
	public CreditAccount(double Balance, String Id,double creditLimit,int noInstallments) {
		super(Balance, Id);
		this.creditLimit=creditLimit;
		this.noInstallments=noInstallments;
	}

	@Override
	public String toString() {
		return "CreditAccount [creditLimit=" + creditLimit + ", noInstallments=" + noInstallments + ", balance="
				+ balance + ", id=" + id + "]";
	}
	
	

}
