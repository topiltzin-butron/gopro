package org.topiltzin.shibumi.gopro.client;

import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.exception.GoProException;

public interface GoProCaptureSettings {

	// GoPro Burst Rate
	void setBurstRate3Over1Sec(GoProCamera goProCamera) throws GoProException;

	void setBurstRate5Over1Sec(GoProCamera goProCamera) throws GoProException;
	
	void setBurstRate10Over1Sec(GoProCamera goProCamera) throws GoProException;

	void setBurstRate10Over2Sec(GoProCamera goProCamera) throws GoProException;

	void setBurstRate30Over1Sec(GoProCamera goProCamera) throws GoProException;

	void setBurstRate30Over2Sec(GoProCamera goProCamera) throws GoProException;

	void setBurstRate30Over3Sec(GoProCamera goProCamera) throws GoProException;

	// GoPro Continuous Shot
	void setContinuousShotSingle(GoProCamera goProCamera) throws GoProException;

	void setContinuousShot3PerSec(GoProCamera goProCamera)
			throws GoProException;

	void setContinuousShot5PerSec(GoProCamera goProCamera)
			throws GoProException;

	void setContinuousShot10PerSec(GoProCamera goProCamera)
			throws GoProException;

	// GoPro Field of View
	void setFieldOfViewWide(GoProCamera goProCamera) throws GoProException;

	void setFieldOfViewMeduim(GoProCamera goProCamera) throws GoProException;

	void setFieldOfViewNarrow(GoProCamera goProCamera) throws GoProException;

	// GoPro Frames per Second
	void setFramesPerSecond12(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond15(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond24(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond25(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond30(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond48(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond50(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond60(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond100(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond120(GoProCamera goProCamera) throws GoProException;

	void setFramesPerSecond240(GoProCamera goProCamera) throws GoProException;

	// GoPro Loop Video
	void setLoopVideoOff(GoProCamera goProCamera) throws GoProException;

	void setLoopVideo5Min(GoProCamera goProCamera) throws GoProException;

	void setLoopVideo20Min(GoProCamera goProCamera) throws GoProException;

	void setLoopVideo60Min(GoProCamera goProCamera) throws GoProException;

	void setLoopVideoMax(GoProCamera goProCamera) throws GoProException;

	// GoPro Orientation
	void setOrientationUp(GoProCamera goProCamera) throws GoProException;

	void setOrientationDown(GoProCamera goProCamera) throws GoProException;

	// GoPro Photo Resolution
	void setPhotoResolution11MPW(GoProCamera goProCamera) throws GoProException;

	void setPhotoResolution8MPW(GoProCamera goProCamera) throws GoProException;

	void setPhotoResolution5MPW(GoProCamera goProCamera) throws GoProException;

	void setPhotoResolution3MPW(GoProCamera goProCamera) throws GoProException;

	// GoPro Protune
	void setProtuneOff(GoProCamera goProCamera) throws GoProException;

	void setProtuneOn(GoProCamera goProCamera) throws GoProException;

	// GoPro Spot Meter
	void setSpotMeterOff(GoProCamera goProCamera) throws GoProException;

	void setSpotMeterOn(GoProCamera goProCamera) throws GoProException;

	// GoPro Timelapse Interval
	void setTimelapseInterval05Sec(GoProCamera goProCamera)
			throws GoProException;

	void setTimelapseInterval1Sec(GoProCamera goProCamera)
			throws GoProException;

	void setTimelapseInterval5Sec(GoProCamera goProCamera)
			throws GoProException;

	void setTimelapseInterval10Sec(GoProCamera goProCamera)
			throws GoProException;

	void setTimelapseInterval30Sec(GoProCamera goProCamera)
			throws GoProException;

	void setTimelapseInterval60Sec(GoProCamera goProCamera)
			throws GoProException;

	// GoPro Video Resolution
	void setVideoResolutionWVGA60(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolutionWVGA120(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolution720_30(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolution720_60(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolution960_30(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolution960_60(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolution1080_30(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolutionProtune1080_30(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolutionProtune1080_24(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolutionProtune960_60(GoProCamera goProCamera)
			throws GoProException;

	void setVideoResolutionProtune1080_25(GoProCamera goProCamera)
			throws GoProException;

	// GoPro White Balance (Only if Protune is ON)
	void setWhiteBalanceProtuneAuto(GoProCamera goProCamera)
			throws GoProException;

	void setWhiteBalanceProtune3000K(GoProCamera goProCamera)
			throws GoProException;

	void setWhiteBalanceProtune5000K(GoProCamera goProCamera)
			throws GoProException;

	void setWhiteBalanceProtune6500K(GoProCamera goProCamera)
			throws GoProException;

	void setWhiteBalanceProtuneCamRaw(GoProCamera goProCamera)
			throws GoProException;

}
