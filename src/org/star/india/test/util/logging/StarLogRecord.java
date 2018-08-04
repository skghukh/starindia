package org.star.india.test.util.logging;

import java.util.logging.Level;

public class StarLogRecord {
	private Level logLevel;
	private String logMessage;
	private String tag;

	public StarLogRecord(Level logLevel, String logMessage) {
		this.logLevel = logLevel;
		this.logMessage = logMessage;
		this.tag = "";
	}

	public StarLogRecord(Level logLevel, String logMessage, String tag) {
		this.logLevel = logLevel;
		this.logMessage = logMessage;
		this.tag = tag;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Level getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(Level logLevel) {
		this.logLevel = logLevel;
	}

	public String getLogMessage() {
		return logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

}
