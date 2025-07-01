package springfast.chapter5.lazy.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = {"springfast.chapter5.lazy.services"})
public class ProgectConfig {
}
