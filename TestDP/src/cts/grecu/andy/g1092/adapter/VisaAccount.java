package cts.grecu.andy.g1092.adapter;

public class VisaAccount extends AbstractBankAccount implements IVisaProcessor {

	public VisaAccount(String accountName, String exchangeRate, double accountBalance) {
		super(accountName, exchangeRate, accountBalance);

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
