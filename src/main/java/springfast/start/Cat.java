package springfast.start;

import org.springframework.stereotype.Component;

/* Классы созданные мной лучше добавлять через стереотипную аннотацию,
* а классы созданные не мной(например: взятые из сторонних библиотек) лучше добавлять через @Bean и метод */

@Component
public class Cat {

    private String name = "Moris";

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
