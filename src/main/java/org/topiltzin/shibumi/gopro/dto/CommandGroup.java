package org.topiltzin.shibumi.gopro.dto;

public enum CommandGroup {

	LIVE("live"), CAMERA("camera"), BACPAC("bacpac");

	private String commandGroup;

	private CommandGroup(String commandGroup) {
		this.commandGroup = commandGroup;
	}

	public String getCommandGroup() {
		return commandGroup;
	}

}
