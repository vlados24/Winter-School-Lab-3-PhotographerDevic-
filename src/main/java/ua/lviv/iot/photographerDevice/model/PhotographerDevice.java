package main.java.ua.lviv.iot.photographerDevice.model;

public abstract class PhotographerDevice {

	private int weight;
	private int size;
	private Target target;

	public PhotographerDevice() {

	}

	public PhotographerDevice(int weight, int size, Target target) {
		this.weight = weight;
		this.size = size;
		this.target = target;
	}

	public String toString() {
		return "PhotographerDevice{" + " weight " + weight + " size " + size + " Target " + target;
	}
	
	public String getHeaders() {
		return  "," + "weight" + "," + "size" + ","+ "target";
	}
	
	public String toCSV() {
		return this.weight + "," + this.size+","+this.target;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

}
