package test.java.ua.lviv.iot;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.ua.lviv.iot.photographerDevice.manager.PhotographerDeviceManager;
import main.java.ua.lviv.iot.photographerDevice.model.Camera;
import main.java.ua.lviv.iot.photographerDevice.model.Lantern;
import main.java.ua.lviv.iot.photographerDevice.model.PhotographerDevice;
import main.java.ua.lviv.iot.photographerDevice.model.Quadcopter;
import main.java.ua.lviv.iot.photographerDevice.model.StudioStand;
import main.java.ua.lviv.iot.photographerDevice.model.Target;

class PhotographerDeviceManagerTest {

	List<PhotographerDevice> testDevice = new ArrayList<>();
	PhotographerDeviceManager testManager = new PhotographerDeviceManager();

	Camera camera = new Camera(100, 22, Target.LANDSCAPE, "Sony", "Yes", 7, "Intel Core");
	Lantern lantern = new Lantern(200, 30, Target.CLASSIC_EVENT, 3, "Powerfull");
	StudioStand studioStand = new StudioStand(17, 25, Target.CLASSIC_EVENT, "Yes", 3, 1);
	Quadcopter quadcopter = new Quadcopter(5, 8, Target.SPORT_EVENT, 1000, 250, 800);

	@BeforeEach
	void setUp() {
		testDevice.add(camera);
		testDevice.add(lantern);
		testDevice.add(studioStand);
		testDevice.add(quadcopter);
	}

	@Test
	void testSortBySize() {
		testManager.sortBySize(testDevice, true);
		Assertions.assertEquals(30, testDevice.get(0).getSize());
		Assertions.assertEquals(25, testDevice.get(1).getSize());
		Assertions.assertEquals(22, testDevice.get(2).getSize());
		Assertions.assertEquals(8, testDevice.get(3).getSize());
	}

	@Test
	void testSortByWeight() {
		testManager.sortByWeight(testDevice, true);
		Assertions.assertEquals(200, testDevice.get(0).getWeight());
		Assertions.assertEquals(100, testDevice.get(1).getWeight());
		Assertions.assertEquals(17, testDevice.get(2).getWeight());
		Assertions.assertEquals(5, testDevice.get(3).getWeight());

	}

	@Test
	void findEssentialDevicesForNatureByTarget() {
		testManager.findEssentialDevicesForNatureByTarget(testDevice, Target.SPORT_EVENT);
		Assertions.assertEquals(Target.SPORT_EVENT, testDevice.get(3).getTarget());

	}
}