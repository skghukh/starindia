package org.star.india.test.util.logging;

import java.util.logging.Level;

import org.star.india.test.util.logging.interf.IStarLogHandler;

public class StarLogger {
	private IStarLogHandler handler;
	private StarLogContext context;
	private int logLevel;

	StarLogger() {
		logLevel = Integer.MIN_VALUE;
		//defaultHandler
		handler = new ConsoleStarLogHandler();
	}

	public void setContext(StarLogContext context) {
		logLevel = context.getLogLevel().intValue();
		handler = context.getLogHandler();
	}

	public void log(Level logLevel, String message) {
		if (!isLoggable(logLevel)) {
			return;
		}
		StarLogRecord lr = new StarLogRecord(logLevel, message);
		logNow(lr);
	}

	public boolean isLoggable(Level level) {
		if (level.intValue() < logLevel) {
			return false;
		}
		return true;
	}

	public void logNow(StarLogRecord record) {
		handler.publish(record);
	}
}
