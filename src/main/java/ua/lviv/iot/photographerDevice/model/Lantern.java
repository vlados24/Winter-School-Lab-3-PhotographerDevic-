package main.java.ua.lviv.iot.photographerDevice.model;

public class Lantern extends PhotographerDevice {
	
	private int colourTemperature;
	private String type;

	public Lantern() {
		
	}

	public Lantern(int weight, int size, Target target, int colourTemperature, String type) {
		super(weight, size, target);
		this.colourTemperature = colourTemperature;
		this.type = type;
		
	}
	
	public String toString() {
		return super.toString() +
				" colourTemperature " + colourTemperature +
				" type " + type ;
	}

	public String getHeaders() {
		return  super.getHeaders() + "," + "colourTemperature" + "," + "type";
	}
	
	public String toCSV() {
		return  this.colourTemperature + "," + this.type;
	}
	
	public int getColourTemperature() {
		return colourTemperature;
	}

	public void setColourTemperature(int colourTemperature) {
		this.colourTemperature = colourTemperature;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
   
}
