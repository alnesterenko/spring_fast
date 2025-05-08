package springfast.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        var parrot = new Parrot();
        parrot.setName("Skreppi Koko");
        return parrot;
    }

    @Bean
    public String hello() {
        return "Hello!";
    }

    @Bean
    public Integer ten() {
        return 10;
    }
}
