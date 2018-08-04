package org.star.india.test.util.logging;

import java.util.logging.Level;

import org.star.india.test.util.logging.interf.ILogger;
import org.star.india.test.util.logging.interf.IStarLogHandler;

public class StarLogger implements ILogger {
	private String name;
	private IStarLogHandler handler;
	private StarLogContext context;
	private int logLevel;

	public StarLogger(String name) {
		this.name = name;
		logLevel = Integer.MIN_VALUE;
		// defaultHandler
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
		StarLogRecord lr = new StarLogRecord(logLevel, message, Thread.currentThread().getName());
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
	
	
	@Override
	public  StarLogger getLogger(String name) {
		return new StarLogger(name);
	}

	@Override
	public StarLogger getLogger(String name, StarLogContext context) {
		StarLogger logger = new StarLogger(name);
		logger.setContext(context);
		return logger;
	}

}
