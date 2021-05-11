package acme.bankaccount;

public class CreditAccount extends AbstractBankAccount implements BankAccountInterface {

	public CreditAccount(String name, String address, int accoutCount) {
		super(name, address, accoutCount);

	}

	@Override
	public void transfer(AbstractBankAccount desination, double sum) {
		desination.setBalance(desination.getBalance()+ sum);
		this.setBalance(this.getBalance() - sum);
	}

	@Override
	public void deposit(double sum) {
		this.balance += sum;

	}

	@Override
	public String toString() {
		return "CreditAccount [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
