package org.topiltzin.shibumi.gopro.dto;

public class GoProCamera extends AbstractBaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String host;
	private int port;
	private Credentials credentials;
	private CameraVersion cameraVersion;
	private Mode mode;

	public GoProCamera(String password) {
		this(new Credentials(password));
	}

	public GoProCamera(Credentials credentials) {
		this(Settings.DEFAULT_HOST, Settings.DEFAULT_PORT, credentials);
	}

	public GoProCamera(String host, int port, String password) {
		this(host, port, new Credentials(password));
	}

	public GoProCamera(String host, int port, Credentials credentials) {
		this.host = host;
		this.port = port;
		this.credentials = credentials;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	public CameraVersion getCameraVersion() {
		return cameraVersion;
	}

	public void setCameraVersion(CameraVersion cameraVersion) {
		this.cameraVersion = cameraVersion;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}

}
