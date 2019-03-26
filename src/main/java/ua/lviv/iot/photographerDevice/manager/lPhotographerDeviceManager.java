package main.java.ua.lviv.iot.photographerDevice.manager;

import java.util.List;

import main.java.ua.lviv.iot.photographerDevice.model.PhotographerDevice;
import main.java.ua.lviv.iot.photographerDevice.model.Target;

public interface lPhotographerDeviceManager {

	public void sortBySize(List<PhotographerDevice> device, boolean reverse);

	public void sortByWeight(List<PhotographerDevice> device, boolean reverse);

	public List<PhotographerDevice>findEssentialDevicesForNatureByTarget(List<PhotographerDevice> device, Target target);

}
