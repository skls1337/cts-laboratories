package cts.grecu.andy.g1092.adapter;

public class AccountAdapter extends AbstractBankAccount implements IVisaProcessor {

	MasterCardAccount accountAdapter = null;

	public AccountAdapter(MasterCardAccount accountAdapter) {
		super(accountAdapter.getAccountName(), accountAdapter.getExchangeRate(), accountAdapter.getAccountBalance());
		this.accountAdapter = accountAdapter;
	}

	@Override
	public void transaction(String sourseAccount, String destinationAccount, double value, String currency) {
		System.out.println("From " + sourseAccount + " to" + destinationAccount + ".Destination bank "
				+ destinationAccount + ". Value " + value + ". Currency " + currency);

	}

	@Override
	public void transactionWithCurrencyExchange(String sourseAccount, String destinationAccount, double value,
			String sourseCurrency, String destinationCurrency) {
		System.out.println("From " + sourseAccount + " to" + destinationAccount + ".Destination bank "
				+ destinationAccount + ". Value " + value + ".Source Currency " + sourseCurrency
				+ ". Destination Currency: " + destinationCurrency);

	}
}
