package springfast.chapter5.prototypebeans.stereotype.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"springfast/chapter5/prototypebeans/stereotype/repositories",
                                "springfast/chapter5/prototypebeans/stereotype/services"})
public class ProjectConfig {
}
