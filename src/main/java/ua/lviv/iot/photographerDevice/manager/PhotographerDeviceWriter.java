package main.java.ua.lviv.iot.photographerDevice.manager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import main.java.ua.lviv.iot.photographerDevice.model.PhotographerDevice;

public class PhotographerDeviceWriter {

	private String filePath;

	public PhotographerDeviceWriter() {
	}

	public PhotographerDeviceWriter(String filePath) {
		this.filePath = filePath;
	}

	public void writeToFile(List<PhotographerDevice> photographerDevice) {
		File cvsFile = new File(filePath + ".csv");
		try (FileOutputStream fos = new FileOutputStream(cvsFile);
		        OutputStreamWriter ow = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
		        BufferedWriter bufWrite = new BufferedWriter(ow);) {

			for (PhotographerDevice device : photographerDevice) {
				bufWrite.write(device.getHeaders());
				bufWrite.newLine();
				bufWrite.write(device.toCSV());
				bufWrite.newLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
