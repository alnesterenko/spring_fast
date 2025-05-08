package springfast.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/* Классы созданные мной лучше добавлять через стереотипную аннотацию,
 * а классы созданные не мной(например: взятые из сторонних библиотек) лучше добавлять через @Bean и метод */

@Configuration
@ComponentScan (basePackages = "springfast.start")
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
