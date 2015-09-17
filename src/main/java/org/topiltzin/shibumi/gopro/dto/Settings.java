package org.topiltzin.shibumi.gopro.dto;

public class Settings extends AbstractBaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected static final String DEFAULT_HOST = "10.5.5.9";
	protected static final int DEFAULT_PORT = 80;
	
//	CM: (ChangeMode)
//	E: GET /camera/CM?t=1234&p=
//	protected static final String BASE_URL = "http://%(host)/%(resource)/%(commandType)?t=%(password)&p=%(operation)";
	public static final String BASE_URL = "http://${host}/${resource}/${commandType}?t=${password}&p=${operation}";
	
}
