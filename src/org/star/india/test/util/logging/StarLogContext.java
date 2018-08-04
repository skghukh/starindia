package org.star.india.test.util.logging;

import java.util.logging.Level;

import org.star.india.test.util.logging.interf.IStarLogHandler;

public class StarLogContext {
	private Level appLogLevel = Level.INFO;
	private IStarLogHandler logHanlder;

	public Level getLogLevel() {
		return appLogLevel;
	}

	public void setLogLevel(Level level) {
		this.appLogLevel = level;
	}

	public IStarLogHandler getLogHandler() {
		return logHanlder;
	}

	public void setLogHanlder(IStarLogHandler handler) {
		this.logHanlder = handler;
	}

}
