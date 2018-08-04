package org.star.india.test.util.logging;

import java.util.Map;

import org.star.india.test.util.logging.interf.IStarLogHandler;

public class FileStarLogHandler implements IStarLogHandler {
    
	public FileStarLogHandler(Map<String, String> props) {

	}

	// this is default hanlder if no place is specified logs will go to /tmp/
	public FileStarLogHandler() {
      
	}

	@Override
	public void publish(StarLogRecord record) {

	}

}
