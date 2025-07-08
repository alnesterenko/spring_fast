package springfast.chapter6.aspectchains.withoutorder.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/* Аннотация @Aspect не является стереотипной.
 С помощью @Aspect мы сообщаем Spring, что в данном классе содержится определение аспекта,
  но это не значит, что Spring сразу создаст для него бин */
@Aspect
@Component
public class LoggingAspect {

    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")
    /* Имя этого параметра должно совпадать со значением атрибута returning, переданного аннотации.
     Если же нас не интересует возвращаемое значение, данный параметр можно не указывать */
    public void log(Object returnedValue) {
        logger.info("Method executed and returned: " + returnedValue);
    }
}
