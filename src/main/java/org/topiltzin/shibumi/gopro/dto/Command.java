package org.topiltzin.shibumi.gopro.dto;

import static org.topiltzin.shibumi.gopro.dto.CommandGroup.CAMERA;
import static org.topiltzin.shibumi.gopro.dto.CommandGroup.BACPAC;
import static org.topiltzin.shibumi.gopro.dto.CommandType.AUTO_POWER_OFF;
import static org.topiltzin.shibumi.gopro.dto.CommandType.BEEP_SOUND;
import static org.topiltzin.shibumi.gopro.dto.CommandType.BURST_RATE;
import static org.topiltzin.shibumi.gopro.dto.CommandType.CAMERA_MODE;
import static org.topiltzin.shibumi.gopro.dto.CommandType.CAMERA_VIDEO_MODE;
import static org.topiltzin.shibumi.gopro.dto.CommandType.CONTINUOUS_SHOT;
import static org.topiltzin.shibumi.gopro.dto.CommandType.DEFAULT_MODE;
import static org.topiltzin.shibumi.gopro.dto.CommandType.FIELD_OF_VIEW;
import static org.topiltzin.shibumi.gopro.dto.CommandType.FRAMES_PER_SECOND;
import static org.topiltzin.shibumi.gopro.dto.CommandType.LED_BLINK;
import static org.topiltzin.shibumi.gopro.dto.CommandType.LOCALIZATION;
import static org.topiltzin.shibumi.gopro.dto.CommandType.LOOP_VIDEO;
import static org.topiltzin.shibumi.gopro.dto.CommandType.ORIENTATION;
import static org.topiltzin.shibumi.gopro.dto.CommandType.PHOTO_RESOLUTION;
import static org.topiltzin.shibumi.gopro.dto.CommandType.POWER;
import static org.topiltzin.shibumi.gopro.dto.CommandType.PREVIEW;
import static org.topiltzin.shibumi.gopro.dto.CommandType.PROTUNE;
import static org.topiltzin.shibumi.gopro.dto.CommandType.SHUTTER;
import static org.topiltzin.shibumi.gopro.dto.CommandType.SPOT_METER;
import static org.topiltzin.shibumi.gopro.dto.CommandType.TIMELAPSE_INTERVAL;
import static org.topiltzin.shibumi.gopro.dto.CommandType.VIDEO_RESOLUTION;
import static org.topiltzin.shibumi.gopro.dto.CommandType.WHITE_BALANCE;
import static org.topiltzin.shibumi.gopro.dto.CommandType._00;
import static org.topiltzin.shibumi.gopro.dto.CommandType._01;
import static org.topiltzin.shibumi.gopro.dto.CommandType._02;
import static org.topiltzin.shibumi.gopro.dto.CommandType._03;
import static org.topiltzin.shibumi.gopro.dto.CommandType._04;
import static org.topiltzin.shibumi.gopro.dto.CommandType._05;
import static org.topiltzin.shibumi.gopro.dto.CommandType._06;
import static org.topiltzin.shibumi.gopro.dto.CommandType._07;
import static org.topiltzin.shibumi.gopro.dto.CommandType._08;
import static org.topiltzin.shibumi.gopro.dto.CommandType._09;
import static org.topiltzin.shibumi.gopro.dto.CommandType._0A;
import static org.topiltzin.shibumi.gopro.dto.CommandType._0B;
import static org.topiltzin.shibumi.gopro.dto.CommandType._11;
import static org.topiltzin.shibumi.gopro.dto.CommandType._1E;
import static org.topiltzin.shibumi.gopro.dto.CommandType._3C;

public enum Command {

	// AUTO POWER OFF
	PO_NEVER(AUTO_POWER_OFF, _00), 
	PO_60S(AUTO_POWER_OFF, _01), 
	PO_120S(AUTO_POWER_OFF, _02),
	PO_300S(AUTO_POWER_OFF, _03),
	
	// BEEP SOUND VOLUME
	NO_BEEP(BEEP_SOUND, _00), 
	BEEP_70(BEEP_SOUND, _01), 
	BEEP_100(BEEP_SOUND, _02),
	
	// BURST RATE
	BU_3_1S(BURST_RATE, _00),
	BU_5_1S(BURST_RATE, _01),
	BU_10_1S(BURST_RATE, _02), 
	BU_10_2S(BURST_RATE, _03),
	BU_30_1S(BURST_RATE, _04), 
	BU_30_2S(BURST_RATE, _05), 
	BU_30_3S(BURST_RATE, _06),
	
	// CAMERA MODE
	VIDEO_MODE(CAMERA_MODE, _00), 
	PHOTO_MODE(CAMERA_MODE, _01), 
	BURST_MODE(CAMERA_MODE, _02), 
	TIMELAPSE_MODE(CAMERA_MODE, _03), 
	TIMER_MODE(CAMERA_MODE, _04),
	
	// VIDEO MODE
	NTSC(CAMERA_VIDEO_MODE, _00), 
	PAL(CAMERA_VIDEO_MODE, _01),
	
	// CONTINUOUS SHOT
	CS_SINGLE(CONTINUOUS_SHOT, _00), 
	CS_3SPS(CONTINUOUS_SHOT, _03), 
	CS_5SPS(CONTINUOUS_SHOT, _05),
	CS_10SPS(CONTINUOUS_SHOT, _0A),
	
	// DEFAULT MODE
	DEFAULT_VIDEO(DEFAULT_MODE, _00), 
	DEFAULT_PHOTO(DEFAULT_MODE, _01), 
	DEFAULT_BURST(DEFAULT_MODE, _02),
	DEFAULT_TIMELAPSE(DEFAULT_MODE, _03),
	
	// FIELD OF VIEW
	WIDE(FIELD_OF_VIEW, _00), 
	MEDIUM(FIELD_OF_VIEW, _01), 
	NARROW(FIELD_OF_VIEW, _02),
	
	// FRAMES PER SECOND
	FPS_12(FRAMES_PER_SECOND, _00), 
	FPS_15(FRAMES_PER_SECOND, _01), 
	FPS_24(FRAMES_PER_SECOND, _02), 
	FPS_25(FRAMES_PER_SECOND, _03), 
	FPS_30(FRAMES_PER_SECOND, _04), 
	FPS_48(FRAMES_PER_SECOND, _05), 
	FPS_50(FRAMES_PER_SECOND, _06), 
	FPS_60(FRAMES_PER_SECOND, _07), 
	FPS_100(FRAMES_PER_SECOND, _08), 
	FPS_120(FRAMES_PER_SECOND, _09), 
	FPS_240(FRAMES_PER_SECOND, _0A),
	// TODO CHECK SUPPORT
	FPS_12_P_5(FRAMES_PER_SECOND, _0B),
	
	// LED BLINK
	NO_BLINK(LED_BLINK, _00), 
	BLINK_2(LED_BLINK, _01), 
	BLINK_4(LED_BLINK, _02),
	
	// LOCALIZATION
	STOP_LOCALIZATION(LOCALIZATION, _00), 
	START_LOCALIZATION(LOCALIZATION, _01),
	
	// LOOP VIDEO
	LO_OFF(LOOP_VIDEO, _00), 
	LO_5_MIN(LOOP_VIDEO, _01), 
	LO_20_MIN(LOOP_VIDEO, _02),
	LO_60_MIN(LOOP_VIDEO, _03), 
	LO_MAX(LOOP_VIDEO, _05),
	
	// ORIENTATION
	ORIENTATION_UP(ORIENTATION, _00), 
	ORIENTATION_DOWN(ORIENTATION, _01),
	
	// PHOTO RESOLUTION
	PR_11_MPW(PHOTO_RESOLUTION, _00), 
	PR_8_MPW(PHOTO_RESOLUTION, _01), 
	PR_5_MPW(PHOTO_RESOLUTION, _02), 
	PR_3_MPW(PHOTO_RESOLUTION, _03),
	
	// POWER
	TURN_OFF(POWER, _00, BACPAC), 
	TURN_ON(POWER, _01, BACPAC), 
	CHANGE_MODE(POWER, _02, BACPAC),
	
	// PREVIEW
	PREVIEW_OFF(PREVIEW, _00),
	PREVIEW_ON(PREVIEW, _02),
	
	// PROTUNE
	PROTUNE_OFF(PROTUNE, _00), 
	PROTUNE_ON(PROTUNE, _01),
	
	// SHUTTER
	STOP_CAPTURE(SHUTTER, _00, BACPAC), 
	START_CAPTURE(SHUTTER, _01, BACPAC),
	
	// SPOT METER
	SPOT_METER_OFF(SPOT_METER, _00), 
	SPOT_METER_ON(SPOT_METER, _01),
	
	// TIMELAPSE INTERVAL
	TI_05_SEC(TIMELAPSE_INTERVAL, _00), 
	TI_1_SEC(TIMELAPSE_INTERVAL, _01), 
	TI_5_SEC(TIMELAPSE_INTERVAL, _05), 
	TI_10_SEC(TIMELAPSE_INTERVAL, _0A), 
	TI_30_SEC(TIMELAPSE_INTERVAL, _1E), 
	TI_60_SEC(TIMELAPSE_INTERVAL, _3C),
	
	// VIDEO RESOLUTION
	VR_WVGA_60(VIDEO_RESOLUTION, _00), 
	VR_WVGA_120(VIDEO_RESOLUTION, _01), 
	VR_720_30(VIDEO_RESOLUTION, _02), 
	VR_720_60(VIDEO_RESOLUTION, _03), 
	VR_960_30(VIDEO_RESOLUTION, _04), 
	VR_960_60(VIDEO_RESOLUTION, _05), 
	VR_1080_30(VIDEO_RESOLUTION, _06),
	VR_PROTUNE_1080_30(VIDEO_RESOLUTION, _07),
	VR_PROTUNE_1080_24(VIDEO_RESOLUTION, _08),
	VR_PROTUNE_960_60(VIDEO_RESOLUTION, _09),
	VR_PROTUNE_1080_25(VIDEO_RESOLUTION, _11),
	
	// WHITE BALANCE (ONLY IF PRO-TUNE IS ON)
	WB_AUTO(WHITE_BALANCE, _00), 
	WB_3000K(WHITE_BALANCE, _01), 
	WB_5000K(WHITE_BALANCE, _02),
	WB_6500K(WHITE_BALANCE, _03), 
	WB_CAMRAW(WHITE_BALANCE, _04);

	// TODO DELETE, ONSCREEN DISPLAY, RESET BACPAC & TIME

	private CommandType commandType;
	private String operation;
	private CommandGroup commandGroup;
	
	private Command(CommandType commandType, String operation) {
		this.commandType = commandType;
		this.operation = operation;
		this.commandGroup = CommandGroup.CAMERA;
	}
	
	private Command(CommandType commandType, String operation, CommandGroup commandGroup) {
		this.commandType = commandType;
		this.operation = operation;
		this.commandGroup = commandGroup;
	}

	public CommandType getCommandType() {
		return commandType;
	}

	public String getOperation() {
		return operation;
	}
	
	public CommandGroup getCommandGroup() {
		return commandGroup;
	}

}
