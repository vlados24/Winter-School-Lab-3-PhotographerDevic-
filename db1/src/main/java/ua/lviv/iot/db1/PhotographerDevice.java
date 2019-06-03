package ua.lviv.iot.db1;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "ParentClass")
public abstract class PhotographerDevice {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private int weight;
	@Column
	private int size; 
	@Enumerated(EnumType.STRING)
	@Column
	private Target target;
	
	
	public PhotographerDevice() {
		
	}
	

	public PhotographerDevice(int weight, int size, Target target) {
		this.weight = weight;
		this.size = size;
		this.target = target;
	}
	
	public String toString() {
		return "PhotographerDevice{" +
				" wight " + weight +
				" size " + size +
				" Target " + target;
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
