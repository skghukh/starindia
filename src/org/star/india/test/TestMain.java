package org.star.india.test;

import java.util.logging.Level;

import org.star.india.test.util.logging.FileStarLogHandler;
import org.star.india.test.util.logging.StarLogContext;
import org.star.india.test.util.logging.StarLogger;

public class TestMain {

	public static void main(String[] args) {

		// default handler which logs to console
		StarLogger slogger = new StarLogger(TestMain.class.getName());
		slogger.log(Level.FINE, "Hello");

		// context which logs to file
		// same way logs can be directed to any place i.e. S3 or ElasticSearch.
		// by crating a new handler and assign it to context;
		StarLogger slogger2 = new StarLogger(TestMain.class.getName());
		StarLogContext starLogFileContext = new StarLogContext();
		starLogFileContext.setLogHanlder(new FileStarLogHandler());
		slogger2.setContext(starLogFileContext);
	}

}
