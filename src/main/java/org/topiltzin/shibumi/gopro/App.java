package org.topiltzin.shibumi.gopro;

import org.topiltzin.shibumi.gopro.client.GoProClient;
import org.topiltzin.shibumi.gopro.client.impl.GoProClientPojoImpl;
import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.dto.Mode;
import org.topiltzin.shibumi.gopro.exception.GoProException;

public class App {
	
	public static void main(String[] args) throws GoProException {
	
		GoProClient goProClient = new GoProClientPojoImpl();
		GoProCamera goProCamera = new GoProCamera("goprotopy");

		String dummyCommand = "http://10.5.5.9/bacpac/se?t=goprotopy";
		// TEST DUMMY OR DIRECT COMMAND
		goProClient.executeCommandDummy(dummyCommand);
		 
		// POWER
//		goProClient.turnOff(goProCamera);
		goProClient.turnOn(goProCamera);
//		goProClient.changeMode(goProCamera);
//		goProClient.changeMode(goProCamera, Mode.BURST);
//		goProClient.changeMode(goProCamera, Mode.PHOTO);
//		goProClient.changeMode(goProCamera, Mode.CAMERA);

		// CAPTURE
//		goProClient.stopCapture(goProCamera);
//		goProClient.startCapture(goProCamera);

		// PREVIEW
//		goProClient.stopPreview(goProCamera);
//		goProClient.startPreview(goProCamera);


		// AUTO POWER OFF
//		goProClient.setAutoPowerNever(goProCamera);
//		goProClient.setAutoPower60Sec(goProCamera);
//		goProClient.setAutoPower120Sec(goProCamera);
//		goProClient.setAutoPower300Sec(goProCamera);
		
		// BEEP SOUND VOLUME
//		goProClient.setNoBeep(goProCamera);
//		goProClient.setBeep70(goProCamera);
//		goProClient.setBeep100(goProCamera);

		// BURST RATE
//		goProClient.setBurstRate3Over1Sec(goProCamera);
//		goProClient.setBurstRate5Over1Sec(goProCamera);
//		goProClient.setBurstRate10Over1Sec(goProCamera);
//		goProClient.setBurstRate10Over2Sec(goProCamera); //no
//		goProClient.setBurstRate30Over1Sec(goProCamera); //no
//		goProClient.setBurstRate30Over2Sec(goProCamera); //no
//		goProClient.setBurstRate30Over3Sec(goProCamera); //no

		// CAMERA MODE
//		goProClient.setVideoMode(goProCamera);
//		goProClient.setPhotoMode(goProCamera);
//		goProClient.setBurstMode(goProCamera);
//		goProClient.setTimelapseMode(goProCamera);
//		goProClient.setTimerMode(goProCamera); //no supported hero 3+

		// VIDEO MODE
//		goProClient.setCameraVideoModeNTSC(goProCamera);
//		goProClient.setCameraVideoModePAL(goProCamera);

		// CONTINUOUS SHOT
//		goProClient.setPhotoMode(goProCamera); // to be able to see it on screen
//		goProClient.setContinuousShotSingle(goProCamera);
//		goProClient.setContinuousShot3PerSec(goProCamera);
//		goProClient.setContinuousShot5PerSec(goProCamera); // resets camera
//		goProClient.setContinuousShot10PerSec(goProCamera); // resets camera
		
		// DEFAULT MODE
//		goProClient.setDefaultModeVideo(goProCamera);
//		goProClient.setDefaultModePhoto(goProCamera);
//		goProClient.setDefaultModeBurst(goProCamera);
//		goProClient.setDefaultModeTimeLapse(goProCamera);

		// FIELD OF VIEW
		// requires certain types of resolution per FoV
//		goProClient.setFieldOfViewWide(goProCamera);
//		goProClient.setFieldOfViewMeduim(goProCamera);
//		goProClient.setFieldOfViewNarrow(goProCamera);

		// FRAMES PER SECOND
//		goProClient.setFramesPerSecond12(goProCamera);
//		goProClient.setFramesPerSecond15(goProCamera);
//		goProClient.setFramesPerSecond24(goProCamera);
//		goProClient.setFramesPerSecond25(goProCamera);
//		goProClient.setFramesPerSecond30(goProCamera);
//		goProClient.setFramesPerSecond48(goProCamera);
//		goProClient.setFramesPerSecond50(goProCamera);
//		goProClient.setFramesPerSecond60(goProCamera);
//		goProClient.setFramesPerSecond100(goProCamera);
//		goProClient.setFramesPerSecond120(goProCamera);
//		goProClient.setFramesPerSecond240(goProCamera);
		
		// LED BLINK
//		goProClient.turnOn(goProCamera);
//		goProClient.setLEDNoBlink(goProCamera);
//		goProClient.setLEDBlink2(goProCamera);
//		goProClient.setLEDBlink4(goProCamera);

		// LOCALIZATION
//		goProClient.stopLocalization(goProCamera);
//		goProClient.startLocalization(goProCamera);
		
		// LOOP VIDEO
//		goProClient.setLoopVideoOff(goProCamera);
//		goProClient.setLoopVideo5Min(goProCamera);
//		goProClient.setLoopVideo20Min(goProCamera);
//		goProClient.setLoopVideo60Min(goProCamera);
//		goProClient.setLoopVideoMax(goProCamera);

		// ORIENTATION
//		goProClient.setOrientationUp(goProCamera);
//		goProClient.setOrientationDown(goProCamera);
		
		// PHOTO RESOLUTION
//		goProClient.setPhotoResolution11MPW(goProCamera);
//		goProClient.setPhotoResolution8MPW(goProCamera);
//		goProClient.setPhotoResolution5MPW(goProCamera);
//		goProClient.setPhotoResolution3MPW(goProCamera);
		
		// PROTUNE
//		goProClient.setProtuneOff(goProCamera);
//		goProClient.setProtuneOn(goProCamera);

		// SPOT METER
//		goProClient.setSpotMeterOff(goProCamera);
//		goProClient.setSpotMeterOn(goProCamera);

		// TIMELAPSE INTERVAL
//		goProClient.setTimelapseInterval05Sec(goProCamera);
//		goProClient.setTimelapseInterval1Sec(goProCamera);
//		goProClient.setTimelapseInterval5Sec(goProCamera);
//		goProClient.setTimelapseInterval10Sec(goProCamera);
//		goProClient.setTimelapseInterval30Sec(goProCamera);
//		goProClient.setTimelapseInterval60Sec(goProCamera);
		
		// VIDEO RESOLUTION
//		goProClient.setVideoResolutionWVGA60(goProCamera);
//		goProClient.setVideoResolutionWVGA120(goProCamera);
//		goProClient.setVideoResolution720_30(goProCamera);
//		goProClient.setVideoResolution720_60(goProCamera);
//		goProClient.setVideoResolution960_30(goProCamera);
//		goProClient.setVideoResolution960_60(goProCamera);
//		goProClient.setVideoResolution1080_30(goProCamera);
//		goProClient.setVideoResolutionProtune1080_30(goProCamera);
//		goProClient.setVideoResolutionProtune1080_24(goProCamera);
//		goProClient.setVideoResolutionProtune960_60(goProCamera);
//		goProClient.setVideoResolutionProtune1080_25(goProCamera);

		// WHITE BALANCE (ONLY IF PRO-TUNE IS ON)
//		goProClient.setWhiteBalanceProtuneAuto(goProCamera);
//		goProClient.setWhiteBalanceProtune3000K(goProCamera);
//		goProClient.setWhiteBalanceProtune5000K(goProCamera);
//		goProClient.setWhiteBalanceProtune6500K(goProCamera);
//		goProClient.setWhiteBalanceProtuneCamRaw(goProCamera);

	}
	
}
