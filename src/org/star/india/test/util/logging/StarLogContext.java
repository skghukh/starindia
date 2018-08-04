package org.star.india.test.util.logging;

import java.util.logging.Level;

import org.star.india.test.util.logging.interf.IStarLogHandler;

public class StarLogContext {
	Level appLogLevel = Level.INFO;

	public Level getLogLevel() {
		return appLogLevel;
	}

	public void setLogLevel(Level level) {
		this.appLogLevel = level;
	}

	public IStarLogHandler getLogHandler() {
		// TODO Auto-generated method stub
		return null;
	}

}
