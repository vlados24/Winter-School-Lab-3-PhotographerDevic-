package test.java.ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.ua.lviv.iot.photographerDevice.manager.PhotographerDeviceManager;
import main.java.ua.lviv.iot.photographerDevice.manager.PhotographerDeviceWriter;
import main.java.ua.lviv.iot.photographerDevice.model.Camera;
import main.java.ua.lviv.iot.photographerDevice.model.Lantern;
import main.java.ua.lviv.iot.photographerDevice.model.PhotographerDevice;
import main.java.ua.lviv.iot.photographerDevice.model.Quadcopter;
import main.java.ua.lviv.iot.photographerDevice.model.StudioStand;
import main.java.ua.lviv.iot.photographerDevice.model.Target;

class TestPhotographerDeviceWrite {
	  List<PhotographerDevice> testDevice = new ArrayList<>();
	  PhotographerDeviceWriter kitchenDeviceWriter;
	  private String filePath = "csvFile";
	  
	
		Camera camera = new Camera(100, 22, Target.LANDSCAPE, "Sony", "Yes", 7, "Intel Core");
		Lantern lantern = new Lantern(200, 30, Target.CLASSIC_EVENT, 3, "Powerfull");
		StudioStand studioStand = new StudioStand(17, 25, Target.CLASSIC_EVENT, "Yes", 3, 1);
		Quadcopter quadcopter = new Quadcopter(5, 8, Target.SPORT_EVENT, 1000, 250, 800 );
		
		
		  @BeforeEach
		  void setUp() {
		    testDevice.add(camera);
		    testDevice.add(lantern);
		    testDevice.add(studioStand);
		    testDevice.add(quadcopter);
		    
		    kitchenDeviceWriter = new PhotographerDeviceWriter(filePath);
		  }

		  @Test
		  void testWriterToFile() {
		    File cvsFile = new File(filePath);
		    kitchenDeviceWriter.writeToFile(testDevice);
		    
		    try(FileInputStream fis = new FileInputStream(cvsFile);
		      InputStreamReader isr = new InputStreamReader(fis);
		      BufferedReader bufReader = new BufferedReader(isr);
		      ){
		      
		      for(PhotographerDevice kitchenDevice : testDevice) {
		        assertEquals(kitchenDevice.getHeaders(), bufReader.readLine());
		        assertEquals(kitchenDevice.toCSV(), bufReader.readLine());
		      }
		    }catch(Exception e) {
		      e.printStackTrace();
		    }
		  }
	  
}
