package springfast.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot());
        return person;
    }
/*
* При первом вызове метода parrot() с аннотацией @Bean Spring создает экземпляр parrot.
*  Затем Spring создает экземпляр person, вызывая метод person() — еще один с аннотацией @Bean.
*  Метод person(), в свою очередь, непосредственно вызывает первый метод, parrot().
*  Значит ли это, что создается два экземпляра типа Parrot?
*
* Нет!
* Если в контексте уже есть бин parrot, то вместо того, чтобы вызвать метод parrot(),
*  Spring сразу извлекает этот экземпляр из контекста.
*  Если же бин parrot в контексте еще не создан, то Spring вызывает метод parrot() и возвращает созданный бин.
* */
}
