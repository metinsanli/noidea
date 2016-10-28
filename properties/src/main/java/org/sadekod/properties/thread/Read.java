package org.sadekod.properties.thread;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Read implements Runnable {

	@Override
	public synchronized void run() {
		InputStream istream = ClassLoader.getSystemResourceAsStream("resources/file01.properties");
		Properties properties = new Properties();
		try {
			
			properties.load(istream);
			System.out.println(

					"\nall:\t" + properties.toString() + 
					"\nsize:\t" + properties.size() +
					"\n1:\t" + properties.getProperty("1") +
					"\n4:\t" + properties.getProperty("4")
					
					);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (istream != null)
					istream.close();
				System.out.println("\nfile closed.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
