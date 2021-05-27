package ro.ase.csie.cts.assignment3.dp.adapter;

public class StoreAdapter extends Store {
	OnlineStore store;

	public StoreAdapter(OnlineStore onlineStore) {
		super(onlineStore.getName(), onlineStore.getProducts());
		this.store = onlineStore;
	}


}
