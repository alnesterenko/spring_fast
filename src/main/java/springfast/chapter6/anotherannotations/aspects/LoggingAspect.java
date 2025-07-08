package springfast.chapter6.anotherannotations.aspects;

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

    /* Кроме @Around, в Spring есть следующие аннотации советов:

@Before — вызывает метод, определяющий логику аспекта, перед выполнением перехватываемого метода;

@AfterReturning — вызывает метод, определяющий логику аспекта,
 после успешного завершения перехватываемого метода.
  При этом значение, возвращаемое перехваченным методом, передается методу аспекта в качестве параметра.
   Если перехваченный метод выдаст исключение, метод аспекта не вызывается;

@AfterThrowing — вызывает метод, определяющий логику аспекта, если перехваченный метод выдает исключение.
 Экземпляр исключения передается методу аспекта в качестве параметра;

  @After — вызывает метод, определяющий логику аспекта, после выполнения перехватываемого метода,
   независимо от того, завершится ли перехваченный метод успешно или выдаст исключение.*/

    /* Будут перехватываться только методы отмеченные аннотацией ToLog */
    /* При использовании @AfterReturning можно также получить значение, возвращаемое перехваченным методом.
     В этом случае к атрибуту value, соответствующему имени метода, добавляется атрибут returning. */
    @AfterReturning(value = "@annotation(ToLog)", returning = "returnedValue")
    /* Имя этого параметра должно совпадать со значением атрибута returning, переданного аннотации.
     Если же нас не интересует возвращаемое значение, данный параметр можно не указывать */
    public void log(Object returnedValue) {
        logger.info("Method executed and returned: " + returnedValue);
    }
}
