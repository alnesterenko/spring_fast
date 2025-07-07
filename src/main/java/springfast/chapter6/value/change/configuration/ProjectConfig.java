package springfast.chapter6.value.change.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"springfast/chapter6/value/capture/services",
                                "springfast/chapter6/value/capture/aspects"})
@EnableAspectJAutoProxy /* Активирует аспекты в Spring-приложении */
public class ProjectConfig {
}
