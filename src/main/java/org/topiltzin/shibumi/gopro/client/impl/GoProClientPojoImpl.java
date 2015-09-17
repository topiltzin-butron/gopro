package org.topiltzin.shibumi.gopro.client.impl;

import org.topiltzin.shibumi.gopro.client.GoProClient;
import org.topiltzin.shibumi.gopro.dto.Command;
import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.dto.Mode;
import org.topiltzin.shibumi.gopro.exception.GoProException;

public class GoProClientPojoImpl extends AbstractBaseClient implements
		GoProClient {

	// DUMMY COMMANDS
	public void executeCommandDummy(String command) throws GoProException {
		super.executeCommandDummy(command);
	}
	
	// CAPTURE
	@Override
	public void stopCapture(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.STOP_CAPTURE);
	}

	@Override
	public void startCapture(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.START_CAPTURE);
	}

	// PREVIEW
	@Override
	public void stopPreview(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.PREVIEW_OFF);
	}

	@Override
	public void startPreview(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.PREVIEW_ON);
	}

	// POWER
	@Override
	public void turnOff(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.TURN_OFF);
	}

	@Override
	public void turnOn(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.TURN_ON);
	}

	@Override
	public void changeMode(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.CHANGE_MODE);
	}

	@Override
	public void changeMode(GoProCamera goProCamera, Mode mode)
			throws GoProException {
		throw new GoProException("METHOD NOT IMPLEMENTED YET");
	}

	// AUTO POWER OFF
	@Override
	public void setAutoPowerNever(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.PO_NEVER);
	}

	@Override
	public void setAutoPower60Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.PO_60S);
	}

	@Override
	public void setAutoPower120Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.PO_120S);
	}

	@Override
	public void setAutoPower300Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.PO_300S);
	}

	// BEEP SOUND VOLUME
	@Override
	public void setNoBeep(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.NO_BEEP);
	}

	@Override
	public void setBeep70(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.BEEP_70);
	}

	@Override
	public void setBeep100(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.BEEP_100);
	}

	// BURST RATE
	@Override
	public void setBurstRate3Over1Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.BU_3_1S);
	}
	
	public void setBurstRate5Over1Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.BU_5_1S);
	}

	@Override
	public void setBurstRate10Over1Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.BU_10_1S);
	}

	@Override
	public void setBurstRate10Over2Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.BU_10_2S);
	}

	@Override
	public void setBurstRate30Over1Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.BU_30_1S);
	}

	@Override
	public void setBurstRate30Over2Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.BU_30_2S);
	}

	@Override
	public void setBurstRate30Over3Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.BU_30_3S);
	}

	// CAMERA MODE
	@Override
	public void setVideoMode(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.VIDEO_MODE);
	}

	@Override
	public void setPhotoMode(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.PHOTO_MODE);
	}

	@Override
	public void setBurstMode(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.BURST_MODE);
	}

	@Override
	public void setTimelapseMode(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.TIMELAPSE_MODE);
	}

	@Override
	public void setTimerMode(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.TIMER_MODE);
	}

	// VIDEO MODE
	@Override
	public void setCameraVideoModeNTSC(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.NTSC);
	}

	@Override
	public void setCameraVideoModePAL(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.PAL);
	}

	// CONTINUOUS SHOT
	@Override
	public void setContinuousShotSingle(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.CS_SINGLE);
	}

	@Override
	public void setContinuousShot3PerSec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.CS_3SPS);
	}

	@Override
	public void setContinuousShot5PerSec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.CS_5SPS);
	}

	@Override
	public void setContinuousShot10PerSec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.CS_10SPS);
	}

	// DEFAULT MODE
	@Override
	public void setDefaultModeVideo(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.DEFAULT_VIDEO);
	}

	@Override
	public void setDefaultModePhoto(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.DEFAULT_PHOTO);
	}

	@Override
	public void setDefaultModeBurst(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.DEFAULT_BURST);
	}

	@Override
	public void setDefaultModeTimeLapse(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.DEFAULT_TIMELAPSE);
	}

	// FIELD OF VIEW
	@Override
	public void setFieldOfViewWide(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.WIDE);
	}

	@Override
	public void setFieldOfViewMeduim(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.MEDIUM);
	}

	@Override
	public void setFieldOfViewNarrow(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.NARROW);
	}

	// FRAMES PER SECOND
	@Override
	public void setFramesPerSecond12(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_12);
	}

	@Override
	public void setFramesPerSecond15(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_15);
	}

	@Override
	public void setFramesPerSecond24(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_24);
	}

	@Override
	public void setFramesPerSecond25(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_25);
	}

	@Override
	public void setFramesPerSecond30(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_30);
	}

	@Override
	public void setFramesPerSecond48(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_48);
	}

	@Override
	public void setFramesPerSecond50(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_50);
	}

	@Override
	public void setFramesPerSecond60(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_60);
	}

	@Override
	public void setFramesPerSecond100(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_100);
	}

	@Override
	public void setFramesPerSecond120(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_120);
	}

	@Override
	public void setFramesPerSecond240(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.FPS_240);
	}

	// LED BLINK
	@Override
	public void setLEDNoBlink(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.NO_BLINK);
	}

	@Override
	public void setLEDBlink2(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.BLINK_2);
	}

	@Override
	public void setLEDBlink4(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.BLINK_4);
	}

	// LOCALIZATION
	@Override
	public void stopLocalization(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.STOP_LOCALIZATION);
	}

	@Override
	public void startLocalization(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.START_LOCALIZATION);
	}

	// LOOP VIDEO
	@Override
	public void setLoopVideoOff(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.LO_OFF);
	}

	@Override
	public void setLoopVideo5Min(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.LO_5_MIN);
	}

	@Override
	public void setLoopVideo20Min(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.LO_20_MIN);
	}

	@Override
	public void setLoopVideo60Min(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.LO_60_MIN);
	}

	@Override
	public void setLoopVideoMax(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.LO_MAX);
	}

	// ORIENTATION
	@Override
	public void setOrientationUp(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.ORIENTATION_UP);
	}

	@Override
	public void setOrientationDown(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.ORIENTATION_DOWN);
	}

	// PHOTO RESOLUTION
	@Override
	public void setPhotoResolution11MPW(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.PR_11_MPW);
	}

	@Override
	public void setPhotoResolution8MPW(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.PR_8_MPW);
	}

	@Override
	public void setPhotoResolution5MPW(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.PR_5_MPW);
	}

	@Override
	public void setPhotoResolution3MPW(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.PR_3_MPW);
	}

	// PROTUNE
	@Override
	public void setProtuneOff(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.PROTUNE_OFF);
	}

	@Override
	public void setProtuneOn(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.PROTUNE_ON);
	}

	// SPOT METER
	@Override
	public void setSpotMeterOff(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.SPOT_METER_OFF);
	}

	@Override
	public void setSpotMeterOn(GoProCamera goProCamera) throws GoProException {
		executeCommand(goProCamera, Command.SPOT_METER_ON);
	}

	// TIMELAPSE INTERVAL
	@Override
	public void setTimelapseInterval05Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.TI_05_SEC);
	}

	@Override
	public void setTimelapseInterval1Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.TI_1_SEC);
	}

	@Override
	public void setTimelapseInterval5Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.TI_5_SEC);
	}

	@Override
	public void setTimelapseInterval10Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.TI_10_SEC);
	}

	@Override
	public void setTimelapseInterval30Sec(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.TI_30_SEC);
	}

	@Override
	public void setTimelapseInterval60Sec(GoProCamera goProCamera)
			throws GoProException {

	}

	// VIDEO RESOLUTION
	@Override
	public void setVideoResolutionWVGA60(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.VR_WVGA_60);
	}

	@Override
	public void setVideoResolutionWVGA120(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.VR_WVGA_120);
	}

	@Override
	public void setVideoResolution720_30(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.VR_720_30);
	}

	@Override
	public void setVideoResolution720_60(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.VR_720_60);
	}

	@Override
	public void setVideoResolution960_30(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.VR_960_30);
	}

	@Override
	public void setVideoResolution960_60(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.VR_960_60);
	}

	@Override
	public void setVideoResolution1080_30(GoProCamera goProCamera)
			throws GoProException {
		executeCommand(goProCamera, Command.VR_1080_30);
	}

	@Override
	public void setVideoResolutionProtune1080_30(GoProCamera goProCamera)
			throws GoProException {
		setProtuneOn(goProCamera);
		executeCommand(goProCamera, Command.VR_PROTUNE_1080_30);
	}

	@Override
	public void setVideoResolutionProtune1080_24(GoProCamera goProCamera)
			throws GoProException {
		setProtuneOn(goProCamera);
		executeCommand(goProCamera, Command.VR_PROTUNE_1080_24);
	}

	@Override
	public void setVideoResolutionProtune960_60(GoProCamera goProCamera)
			throws GoProException {
		setProtuneOn(goProCamera);
		executeCommand(goProCamera, Command.VR_PROTUNE_960_60);
	}

	@Override
	public void setVideoResolutionProtune1080_25(GoProCamera goProCamera)
			throws GoProException {
		setProtuneOn(goProCamera);
		executeCommand(goProCamera, Command.VR_PROTUNE_1080_25);
	}

	// WHITE BALANCE (ONLY IF PRO-TUNE IS ON)
	@Override
	public void setWhiteBalanceProtuneAuto(GoProCamera goProCamera)
			throws GoProException {
		setProtuneOn(goProCamera);
		executeCommand(goProCamera, Command.WB_AUTO);
	}

	@Override
	public void setWhiteBalanceProtune3000K(GoProCamera goProCamera)
			throws GoProException {
		setProtuneOn(goProCamera);
		executeCommand(goProCamera, Command.WB_3000K);
	}

	@Override
	public void setWhiteBalanceProtune5000K(GoProCamera goProCamera)
			throws GoProException {
		setProtuneOn(goProCamera);
		executeCommand(goProCamera, Command.WB_5000K);
	}

	@Override
	public void setWhiteBalanceProtune6500K(GoProCamera goProCamera)
			throws GoProException {
		setProtuneOn(goProCamera);
		executeCommand(goProCamera, Command.WB_6500K);
	}

	@Override
	public void setWhiteBalanceProtuneCamRaw(GoProCamera goProCamera)
			throws GoProException {
		setProtuneOn(goProCamera);
		executeCommand(goProCamera, Command.WB_CAMRAW);
	}

}
