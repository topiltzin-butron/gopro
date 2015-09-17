package org.topiltzin.shibumi.gopro.client;

import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.exception.GoProException;

public interface GoProCameraMode {

	// GoPro Camera Mode
	void setVideoMode(GoProCamera goProCamera) throws GoProException;
	
	void setPhotoMode(GoProCamera goProCamera) throws GoProException;
	
	void setBurstMode(GoProCamera goProCamera) throws GoProException;
	
	void setTimelapseMode(GoProCamera goProCamera) throws GoProException;
	
	void setTimerMode(GoProCamera goProCamera) throws GoProException;

	// GoPro Camera Video Mode

	void setCameraVideoModeNTSC(GoProCamera goProCamera) throws GoProException;

	void setCameraVideoModePAL(GoProCamera goProCamera) throws GoProException;

	// GoPro Default Mode
	void setDefaultModeVideo(GoProCamera goProCamera) throws GoProException;
	
	void setDefaultModePhoto(GoProCamera goProCamera) throws GoProException;
	
	void setDefaultModeBurst(GoProCamera goProCamera) throws GoProException;
	
	void setDefaultModeTimeLapse(GoProCamera goProCamera) throws GoProException;

}
