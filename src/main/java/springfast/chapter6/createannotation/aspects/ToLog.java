package springfast.chapter6.createannotation.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) /* Активировать аннотацию для перехвата во время выполнения приложения */
@Target(ElementType.METHOD) /* Применять её только для методов */
public @interface ToLog {
}
