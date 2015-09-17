package org.topiltzin.shibumi.gopro.dto;

public class Credentials extends AbstractBaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String password;

	public Credentials(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
