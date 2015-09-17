package org.topiltzin.shibumi.gopro.client;

import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.dto.Mode;
import org.topiltzin.shibumi.gopro.exception.GoProException;

interface GoProPower {

	// GoPro Power Control
	void turnOff(GoProCamera goProCamera) throws GoProException;

	void turnOn(GoProCamera goProCamera) throws GoProException;

	void changeMode(GoProCamera goProCamera) throws GoProException;

	void changeMode(GoProCamera goProCamera, Mode mode) throws GoProException;

	// GoPro Auto Power
	void setAutoPowerNever(GoProCamera goProCamera) throws GoProException;

	void setAutoPower60Sec(GoProCamera goProCamera) throws GoProException;

	void setAutoPower120Sec(GoProCamera goProCamera) throws GoProException;

	void setAutoPower300Sec(GoProCamera goProCamera) throws GoProException;

	// Localize GoPro
	void stopLocalization(GoProCamera goProCamera) throws GoProException;

	void startLocalization(GoProCamera goProCamera) throws GoProException;

}
