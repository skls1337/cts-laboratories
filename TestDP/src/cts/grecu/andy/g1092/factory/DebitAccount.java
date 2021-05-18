package cts.grecu.andy.g1092.factory;

public class DebitAccount extends BankAccount {

	private boolean isSalaryStored;
	private boolean overdraftOn;
	
	public DebitAccount(double Balance, String Id,boolean isSalaryStored,boolean overdraftOn) {
		super(Balance, Id);
		this.isSalaryStored=isSalaryStored;
		this.overdraftOn=overdraftOn;
				
	}

	@Override
	public String toString() {
		return "DebitAccount [isSalaryStored=" + isSalaryStored + ", overdraftOn=" + overdraftOn + ", balance="
				+ balance + ", id=" + id + "]";
	}
	
	

}
