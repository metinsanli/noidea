package org.sadekod.properties;

import org.sadekod.properties.thread.Read;
import org.sadekod.properties.thread.Write;

public class Main {
	public static void main(String[] args) {
		
		Thread threadRead = new Thread(new Read());
		threadRead.start();
		//
		Thread threadWrite = new Thread(new Write());
		threadWrite.start();
		
	}
}
