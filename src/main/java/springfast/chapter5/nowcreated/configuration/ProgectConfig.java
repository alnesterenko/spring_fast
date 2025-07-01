package springfast.chapter5.nowcreated.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = {"springfast.chapter5.nowcreated.services"})
public class ProgectConfig {
}
