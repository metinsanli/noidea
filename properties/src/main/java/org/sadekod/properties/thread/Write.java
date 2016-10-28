package org.sadekod.properties.thread;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Write implements Runnable {

	@Override
	public void run() {

		OutputStream outputStream = null;
		Properties properties = new Properties();

		properties.setProperty("0", "zero");
		properties.setProperty("1", "one");
		properties.setProperty("2", "two");
		properties.setProperty("3", "three");
		properties.setProperty("4", "four");

		System.out.println("\nall:\t" + properties.toString());

		try {

			outputStream = new FileOutputStream(System.getProperty("user.home") + "/Desktop/" + "file02.properties");
			properties.store(outputStream, "sample properties file");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (outputStream != null)
				try {
					outputStream.close();
					System.out.println("file was saved to desktop folder.");
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
