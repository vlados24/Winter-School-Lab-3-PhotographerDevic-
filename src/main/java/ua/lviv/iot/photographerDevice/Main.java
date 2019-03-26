package main.java.ua.lviv.iot.photographerDevice;


import java.util.ArrayList;
import java.util.List;

import main.java.ua.lviv.iot.photographerDevice.manager.PhotographerDeviceManager;
import main.java.ua.lviv.iot.photographerDevice.model.Camera;
import main.java.ua.lviv.iot.photographerDevice.model.Lantern;
import main.java.ua.lviv.iot.photographerDevice.model.PhotographerDevice;
import main.java.ua.lviv.iot.photographerDevice.model.Quadcopter;
import main.java.ua.lviv.iot.photographerDevice.model.StudioStand;
import main.java.ua.lviv.iot.photographerDevice.model.Target;

public class Main {
	public static void main(String[] args) {
		
		PhotographerDeviceManager manager = new  PhotographerDeviceManager();
		Camera camera = new Camera(100, 22, Target.LANDSCAPE, "Sony", "Yes", 7, "Intel Core");
		Lantern lantern = new Lantern(200, 30, Target.CLASSIC_EVENT, 3, "Powerfull");
		StudioStand studioStand = new StudioStand(17, 25, Target.CLASSIC_EVENT, "Yes", 3, 1);
		Quadcopter quadcopter = new Quadcopter(5, 8, Target.SPORT_EVENT, 1000, 250, 800 );
		
		List<PhotographerDevice> listDevice = new ArrayList( );
		listDevice.add(camera);
		listDevice.add(lantern);
		listDevice.add(studioStand);
		listDevice.add(quadcopter);
		
		manager.sortBySize(listDevice, true);
		System.out.print(listDevice);
		manager.sortByWeight(listDevice, true);
		System.out.print(listDevice);
		
	}

}
