package cts.grecu.andy.g1092.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		AbstractBankAccount visaAccount=new VisaAccount("Visa Account Credit","euro", 150);
		MasterCardAccount masterCard=new MasterCardAccount("Mastercard Account Credit","dollars", 150);
		
		AccountAdapter adapter=new AccountAdapter(masterCard);
		adapter.transactionWithCurrencyExchange(visaAccount.getAccountName(), masterCard.getAccountName(), 150, "euro", "dollar");
		adapter.transactionWithCurrencyExchange(visaAccount.getAccountName(), masterCard.getAccountName(), 250, "euro", "dollar");
		adapter.transactionWithCurrencyExchange(masterCard.getAccountName(), visaAccount.getAccountName(), 650, "dollar", "dollar");
		
	}

}
