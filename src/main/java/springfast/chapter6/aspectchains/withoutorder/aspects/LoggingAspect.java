package springfast.chapter6.aspectchains.withoutorder.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

/* Аннотация @Aspect не является стереотипной.
 С помощью @Aspect мы сообщаем Spring, что в данном классе содержится определение аспекта,
  но это не значит, что Spring сразу создаст для него бин */
@Aspect
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");
        /* Метод proceed() делегирует выполнение цепочки аспектов.
         Он вызывает либо следующий аспект, либо перехватываемый метод */
        Object returnedValue = joinPoint.proceed();

        logger.info("Logging Aspect: Method executed and returned: " + returnedValue);
        return returnedValue;
    }
}
