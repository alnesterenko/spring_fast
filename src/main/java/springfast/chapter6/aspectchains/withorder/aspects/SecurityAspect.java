package springfast.chapter6.aspectchains.withorder.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1)
public class SecurityAspect {

    private final Logger logger = Logger.getLogger(SecurityAspect.class.getName());

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
