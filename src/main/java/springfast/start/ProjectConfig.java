package springfast.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean (name = "parrot_1")
    @Primary
    public Parrot parrot1() {
        var parrot = new Parrot();
        parrot.setName("Skreppi Koko");
        return parrot;
    }

    @Bean (value = "parrot_2")
    public Parrot parrot2() {
        var parrot = new Parrot();
        parrot.setName("Mikki Maus");
        return parrot;
    }

    @Bean ("parrot_3")
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
