package springfast.chapter3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
* Следует обратить внимание, что "Parrot created !" выводится два раза,
*  то есть создаются оба бина с попугаями.
* */

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println("Person's name: " + person.getName());
        System.out.println("Person's parrot: " + person.getParrot());
    }
}
