package org.topiltzin.shibumi.gopro.client;

import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.exception.GoProException;

interface GoProSettings {

	// GoPro Beep
	void setNoBeep(GoProCamera goProCamera) throws GoProException;

	void setBeep70(GoProCamera goProCamera) throws GoProException;

	void setBeep100(GoProCamera goProCamera) throws GoProException;

	// GoPro LED Blink
	void setLEDNoBlink(GoProCamera goProCamera) throws GoProException;

	void setLEDBlink2(GoProCamera goProCamera) throws GoProException;

	void setLEDBlink4(GoProCamera goProCamera) throws GoProException;

}
