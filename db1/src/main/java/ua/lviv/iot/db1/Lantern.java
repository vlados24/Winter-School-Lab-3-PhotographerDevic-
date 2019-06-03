package ua.lviv.iot.db1;

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
