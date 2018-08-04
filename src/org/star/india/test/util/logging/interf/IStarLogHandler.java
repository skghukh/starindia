package org.star.india.test.util.logging.interf;

import org.star.india.test.util.logging.StarLogRecord;

public interface IStarLogHandler {
	void publish(StarLogRecord record);
}
