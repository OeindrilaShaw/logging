package com.pack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class sample1 {
	 static final Logger logger=Logger.getLogger(sample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   PropertyConfigurator.configure("log1.properties"); // log all messages on the console,,defafault consoleappender,,patternlayout
   logger.debug("sample debug message");
   logger.error("sample error message");
   logger.fatal("sample fatal message");
   logger.info("sample info message");
   logger.warn("sample warn message");

   
	}

}
