package org.star.india.test.util.logging;

import org.star.india.test.util.logging.interf.IStarLogHandler;

public class ConsoleStarLogHandler implements IStarLogHandler{

	@Override
	public void publish(StarLogRecord record) {
	   System.out.println(record.getLogLevel()+ " "+record.getTag()+" "+record.getLogMessage());
	}

}
