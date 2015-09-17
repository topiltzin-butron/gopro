package org.topiltzin.shibumi.gopro.dto;


public enum CommandType {

	AUTO_POWER_OFF("AO"),
	BEEP_SOUND("BS"),
	BURST_RATE("BU"),
	CAMERA_MODE("CM"),
	CAMERA_VIDEO_MODE("VM"),
	CONTINUOUS_SHOT("CS"),
	DEFAULT_MODE("DM"),
	FIELD_OF_VIEW("FV"), 
	FRAMES_PER_SECOND("FS"),
	LED_BLINK("LB"),
	LOCALIZATION("LL"),
	LOOP_VIDEO("LO"),
	ORIENTATION("UP"),
	PHOTO_RESOLUTION("PR"),
	POWER("PW"),
	PREVIEW("PV"),
	PROTUNE("PT"),
	SHUTTER("SH"),
	SPOT_METER("EX"),
	TIMELAPSE_INTERVAL("TI"),
	VIDEO_RESOLUTION("VR"),
	WHITE_BALANCE("WB"), 
	// TODO Implement the rest
	DELETE_LAST("DL"), 
	DELETE_ALL("DL"), 
	DELETE_SPECIFIC("DF"),
	ON_SCREEN_DISPLAY("OS"),
	RESET_BACPAC("RS"),
	TIME("TM");

	public static final String _00 = "%00";
	public static final String _01 = "%01";
	public static final String _02 = "%02";
	public static final String _03 = "%03";
	public static final String _04 = "%04";
	public static final String _05 = "%05";
	public static final String _06 = "%06";
	public static final String _07 = "%07";
	public static final String _08 = "%08";
	public static final String _09 = "%09";
	public static final String _0A = "%0A";
	public static final String _0B = "%0B";
	public static final String _11 = "%11";
	public static final String _1E = "%1E";
	public static final String _3C = "%3C";
	
	private String commandType;
	

	private CommandType(String commandType) {
		this.commandType = commandType;
	}

	public String getCommandType() {
		return commandType;
	}

}
