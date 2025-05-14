package springfast.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
* У этого способа больше недостатков, чем преимуществ:
*  код сложнее читать,
*  нельзя пометить поле как final,
*  тестирование не становится проще.
* */

@Component
public class Person {

    private String name = "Ella";

    private Parrot parrot;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
