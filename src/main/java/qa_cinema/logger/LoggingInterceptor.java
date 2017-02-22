package qa_cinema.logger;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import qa_cinema.annotations.Loggable;


@Interceptor @Loggable
public class LoggingInterceptor {
	@Inject private Logger log;
	
	@AroundInvoke public Object logMethod(InvocationContext iCxt) throws Exception{
		log.entering(iCxt.getTarget().getClass().getName(), iCxt.getMethod().getName());
		try{
			return iCxt.proceed();
		} finally{
		log.exiting(iCxt.getTarget().getClass().getName(), iCxt.getMethod().getName());
		}
		

	}

}
