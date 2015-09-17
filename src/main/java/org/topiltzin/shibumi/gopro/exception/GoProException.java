package org.topiltzin.shibumi.gopro.exception;

public class GoProException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GoProException(String message) {
		super(message);
	}

	public GoProException(String message, Exception exception) {
		super(message, exception);
	}

}
