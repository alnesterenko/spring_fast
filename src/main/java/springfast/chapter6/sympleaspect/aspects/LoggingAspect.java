package springfast.chapter6.sympleaspect.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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

    /* Использованное в примере выражение среза AspectJ сообщает Spring,
     что нужно перехватывать вызовы всех методов из пакета services,
      независимо от типа возвращаемого значения, класса, к которому метод принадлежит,
       имени метода или принимаемых им параметров */
    /* !!! В следующей строке путь до нужного пакета разделять ТОЛЬКО точками !!!
    * !!! И обратить внимание на открывающие и закрывающие скобки !!! */
    @Around("execution(* springfast.chapter6.sympleaspect.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method will execute");
        /* Если не вызвать метод proceed() для параметра аспекта ProceedingJoinPoint,
         аспект не будет делегировать управление перехваченному методу,
          то есть метод publishComment() у объекта CommentService не будет вызван.
           Надписи выведутся, а метод вызван не будет */
        joinPoint.proceed(); /* Делегирование управления перехваченному методу */
        logger.info("Method executed");
    }
}
