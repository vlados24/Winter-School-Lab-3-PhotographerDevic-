package main.java.ua.lviv.iot.photographerDevice.model;

public class StudioStand extends PhotographerDevice {

	private String lightSynchronizer;
	private int maximumShootingHeight;
	private int minimumShootingHeight;
	
	public StudioStand() {
	}

	public StudioStand(int weight, int size, Target target, String lightSynchronizer, int maximumShootingHeight, int minimumShootingHeight) {
		super(weight, size, target);
		this.lightSynchronizer = lightSynchronizer;
		this.maximumShootingHeight = maximumShootingHeight;
		this.minimumShootingHeight = minimumShootingHeight;
	}

	public String toString() {
		return super.toString() +
				" lightSynchronizer " + lightSynchronizer +
				" maximumShootingHeight " + maximumShootingHeight +
				" minimumShootingHeight " + minimumShootingHeight;
	
	}
	public String getHeaders() {
		return super.getHeaders() + "," + "lightSynchronizer" + "," + "maximumShootingHeight" + ","+ "minimumShootingHeight";
	}
	
	public String toCSV() {
		return this.lightSynchronizer + "," + this.maximumShootingHeight+","+this.minimumShootingHeight;
	}
	public String getLightSynchronizer() {
		return lightSynchronizer;
	}

	public void setLightSynchronizer(String lightSynchronizer) {
		this.lightSynchronizer = lightSynchronizer;
	}

	public int getMaximumShootingHeight() {
		return maximumShootingHeight;
	}

	public void setMaximumShootingHeight(int maximumShootingHeight) {
		this.maximumShootingHeight = maximumShootingHeight;
	}

	public int getMinimumShootingHeight() {
		return minimumShootingHeight;
	}

	public void setMinimumShootingHeight(int minimumShootingHeight) {
		this.minimumShootingHeight = minimumShootingHeight;
	}
	
	

}
