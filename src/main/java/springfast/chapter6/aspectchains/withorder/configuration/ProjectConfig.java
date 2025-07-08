package springfast.chapter6.aspectchains.withorder.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfast.chapter6.aspectchains.withorder.aspects.LoggingAspect;
import springfast.chapter6.aspectchains.withorder.aspects.SecurityAspect;

@Configuration
@ComponentScan(basePackages = {"springfast/chapter6/aspectchains/withorder"})
@EnableAspectJAutoProxy /* Активирует аспекты в Spring-приложении */
public class ProjectConfig {
    /* Теперь очерёдность зависит от чисел в аннотации @Order(?) */
    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }

    @Bean
    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }


}
