package ro.ase.csie.cts.g1092.dp.memento;

import java.util.Date;

public class HeroRestorePoint {
	String name;
	int lifePoints;
	private String magick;

	private Date timestamp;

	public HeroRestorePoint(String name, int lifePoints, String magick) {
		this.name = name;
		this.lifePoints = lifePoints;
		this.magick = magick;
		this.timestamp = new Date();
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMagick() {
		return magick;
	}
	
	

}
