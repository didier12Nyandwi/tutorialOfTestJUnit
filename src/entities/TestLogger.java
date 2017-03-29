package entities;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class TestLogger {
	final static Logger  logs = Logger.getLogger(TestLogger.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logs.debug("this is Debug");
		logs.info("tihs is info");
		logs.warn("this is warn");
		logs.error("this is error");
		logs.fatal("this is fatal");
	}

}
