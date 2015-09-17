package org.topiltzin.shibumi.gopro.client.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.topiltzin.shibumi.gopro.dto.Command;
import org.topiltzin.shibumi.gopro.dto.CommandGroup;
import org.topiltzin.shibumi.gopro.dto.GoProCamera;
import org.topiltzin.shibumi.gopro.dto.Settings;
import org.topiltzin.shibumi.gopro.exception.GoProException;

public class CommandBuilder {

	private GoProCamera goProCamera;
	private Command command;

	private static final String START_FIELD = "\\$\\{";
	private static final String END_FIELD = "\\}";
	private static final String REGEX = START_FIELD + "([^}]+)" + END_FIELD;
	private static final Pattern PATTERN = Pattern.compile(REGEX);

	private static final String HOST = "host";
	private static final String PORT = "port";
	private static final String RESOURCE = "resource";
	private static final String COMMAND_TYPE = "commandType";
	private static final String PASSWORD = "password";
	private static final String OPERATION = "operation";

	public CommandBuilder(GoProCamera goProCamera, Command command) {
		this.goProCamera = goProCamera;
		this.command = command;
	}

	public String build() throws GoProException {

		CommandGroup commandGroup = command.getCommandGroup();
		
		Map<String, String> values = new HashMap<String, String>();
		values.put(HOST, goProCamera.getHost());
		values.put(PORT, Integer.toString(goProCamera.getPort()));
		values.put(RESOURCE, commandGroup.getCommandGroup());
		values.put(COMMAND_TYPE, command.getCommandType().getCommandType());
		values.put(PASSWORD, goProCamera.getCredentials().getPassword());
		values.put(OPERATION, command.getOperation());

		Matcher matcher = PATTERN.matcher(Settings.BASE_URL);
		String result = Settings.BASE_URL;
		while (matcher.find()) {
			String[] found = matcher.group(1).split("\\.");

			try {
				Object object = values.get(found[0]);
				String newVal = null;
				newVal = object.toString();
				result = result.replaceFirst(REGEX, newVal);
			} catch (IllegalArgumentException e) {
				throw new GoProException("Illegal argument: '" + found[0]
						+ "' while building command", e);
			}
		}

		return result;
	}

}
