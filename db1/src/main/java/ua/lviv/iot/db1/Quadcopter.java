package ua.lviv.iot.db1;

public class Quadcopter extends PhotographerDevice {
	
	private int maxHeight;
	private int power;
	private int batteryCapacity;

	public Quadcopter() {
		
	}

	public Quadcopter(int weight, int size, Target target, int maxHeight, int power, int batteryCapacity) {
		super(weight, size, target);
		this.maxHeight = maxHeight;
		this.power = power;
		this.batteryCapacity = batteryCapacity;
	}
	
	public String toString() {
		return super.toString() +
				" maxHeight " + maxHeight +
				" power " + power +
				" batteryCapacity " + batteryCapacity;
	}

	public int getMaxHeight() {
		return maxHeight;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	
}
