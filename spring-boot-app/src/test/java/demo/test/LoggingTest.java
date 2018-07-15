package demo.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest {
	@Test
	public void testLogging() {
		Logger logger = LoggerFactory.getLogger(LoggingTest.class);
		logger.trace("this is a TRACE message");
		logger.debug("this is a DEBUG message");
		logger.info("this is a INFO message");
		logger.warn("this is a WARN message");
		logger.error("this is a ERROR message");
	}
}
