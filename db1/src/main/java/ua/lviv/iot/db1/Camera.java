package ua.lviv.iot.db1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("childClass")
public class Camera extends PhotographerDevice {
	@Column
	private String model;
	@Column
	private String rotaryDisplay;
	@Column
	private int matrix;
	@Column
	private String processor;
	

	public Camera() {
	}

	public Camera(int weight, int size, Target target,String model,String rotaryDisplay,int matrix,String processor) {
		super(weight, size, target);
		this.model = model;
		this.rotaryDisplay = rotaryDisplay;
		this.matrix = matrix;
		this.processor = processor;
		
	}

	public String toString() {
		return super.toString() +
				" model " + model +
				" rotaryDisplay " + rotaryDisplay +
				" matrix " + matrix +
				" processor " + processor ;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRotaryDisplay() {
		return rotaryDisplay;
	}

	public void setRotaryDisplay(String rotaryDisplay) {
		this.rotaryDisplay = rotaryDisplay;
	}

	public int getMatrix() {
		return matrix;
	}

	public void setMatrix(int matrix) {
		this.matrix = matrix;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	
	
}
