package springfast.chapter6.createannotation.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"springfast/chapter6/createannotation/services",
                                "springfast/chapter6/createannotation/aspects"})
@EnableAspectJAutoProxy /* Активирует аспекты в Spring-приложении */
public class ProjectConfig {
}
