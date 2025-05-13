package springfast.chapter3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
* Недостатки такого подхода:
* 1) Нет возможности отметить это поле как final
*  (если поле будет final и не будет начального значения, то такой код не пройдёт компиляцию)
*  и таким образом гарантировать, что никто не сможет изменить его после того, как оно будет использовано.
* 2) При инициализации приходится самостоятельно управлять значением, а это сложнее.
* */

@Component
public class Person {

    private String name = "Ella";
    @Autowired
    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
