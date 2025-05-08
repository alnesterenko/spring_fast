package springfast.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        var parrot = new Parrot();
        parrot.setName("Skreppi Koko");
        return parrot;
    }

    @Bean
    public Parrot parrot2() {
        var parrot = new Parrot();
        parrot.setName("Mikki Maus");
        return parrot;
    }

    @Bean
    public Parrot parrot3() {
        var parrot = new Parrot();
        parrot.setName("Rikki Martin");
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
