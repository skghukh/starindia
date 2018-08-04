package org.star.india.test.util.logging.interf;

import org.star.india.test.util.logging.StarLogContext;
import org.star.india.test.util.logging.StarLogger;

public interface ILogger {

	StarLogger getLogger(String name);
	
	StarLogger getLogger(String name, StarLogContext context);
	 
	
	
}	
