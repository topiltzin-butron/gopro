package org.topiltzin.shibumi.gopro.client;

import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.exception.GoProException;

public interface GoProClient extends GoProPower, GoProSettings,
		GoProCaptureSettings, GoProCameraMode {

	// Dummy Commands
	public void executeCommandDummy(String command) throws GoProException;
	
	// GoPro Shutter
	void stopCapture(GoProCamera goProCamera) throws GoProException;

	void startCapture(GoProCamera goProCamera) throws GoProException;

	// GoPro Preview
	void stopPreview(GoProCamera goProCamera) throws GoProException;

	void startPreview(GoProCamera goProCamera) throws GoProException;

}
