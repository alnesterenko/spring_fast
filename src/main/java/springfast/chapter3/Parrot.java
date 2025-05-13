package springfast.chapter3;

import org.springframework.stereotype.Component;

/*
* Важно не забыть указать, что попудлай тоже компонент !
* */

@Component
public class Parrot {

    private String name = "Koko";

    public Parrot() {
        System.out.println("Parrot created !");
    }

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Parrot: " + name;
    }
}
