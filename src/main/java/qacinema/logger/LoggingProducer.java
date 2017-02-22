package qacinema.logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.apache.log4j.Logger;

public class LoggingProducer {
	
	@Produces
	public Logger produceLogger(InjectionPoint injectPoint){
		return Logger.getLogger(injectPoint.getMember().getDeclaringClass().getName());
	}

}
