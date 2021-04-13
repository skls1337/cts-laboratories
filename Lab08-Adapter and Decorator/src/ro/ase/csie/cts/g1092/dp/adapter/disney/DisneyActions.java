package ro.ase.csie.cts.g1092.dp.adapter.disney;

public interface DisneyActions {
	public abstract void changeLocation(int x,int y);
	public abstract void isWounded(int lostPoints);
	public abstract void isHealing(int recoveredPoints);
	
	public abstract String getName();
	public abstract int getPower();
	
}
