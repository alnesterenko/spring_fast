package springfast.chapter6.aspectchains.withoutorder.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class ASecurityAspect {

    private final Logger logger = Logger.getLogger(ASecurityAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Security Aspect: Calling the intercepted method");
        /* Метод proceed() делегирует выполнение цепочки аспектов.
         Он вызывает либо следующий аспект, либо перехватываемый метод */
        Object returnedValue = joinPoint.proceed();

        logger.info("Security Aspect: Method executed and returned: " + returnedValue);
        return returnedValue;
    }
}
