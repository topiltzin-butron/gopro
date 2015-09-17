package org.topiltzin.shibumi.gopro;

import org.topiltzin.shibumi.gopro.client.GoProClient;
import org.topiltzin.shibumi.gopro.client.impl.GoProClientPojoImpl;
import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.exception.GoProException;

public class GoPro {
	
	public static void main(String[] args) throws GoProException, InterruptedException {
	
		GoProClient goProClient = new GoProClientPojoImpl();
		GoProCamera goProCamera = new GoProCamera("goprotopy");

		/**
		 * This example executes this sequence:
		 * 1. CAMERA ON
		 * 2. START RECORDING
		 * 3. STOP RECORDING
		 * 4. CAMERA OFF
		 * 
		 */

		System.out.println("1. Turning camera on");
		goProClient.turnOn(goProCamera);
		Thread.sleep(3000);

		System.out.println("2. Start recording");
		goProClient.startCapture(goProCamera);
		Thread.sleep(5000);
		
		System.out.println("3. Stop recording");
		goProClient.stopCapture(goProCamera);
		Thread.sleep(3000);
		
		System.out.println("4. Turning camera off");
		goProClient.turnOff(goProCamera);
		
	}
	
}
