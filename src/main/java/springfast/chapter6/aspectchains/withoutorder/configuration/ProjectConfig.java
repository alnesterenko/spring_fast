package springfast.chapter6.aspectchains.withoutorder.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"springfast/chapter6/aspectchains/withoutorder"})
@EnableAspectJAutoProxy /* Активирует аспекты в Spring-приложении */
public class ProjectConfig {
    /* Очерёдность выполнения аспектов определяет их алфавитный порядок в папке aspects
    * (Если нет аннотаций @Order и @Bean) */
}
