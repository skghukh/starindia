To create a new log handler
just implement IStarLogHanlder and write your publish method.
add this hanlder to LogContext and initialize the logger.
Context contains all settings for logging, i.e. log level of your application or file name where logging needs to be done.
