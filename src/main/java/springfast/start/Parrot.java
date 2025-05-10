package springfast.start;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Parrot {
    private String name;

    public Parrot(String name) {
        this.name = name;
    }

    public Parrot() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* После создания бина значение поля name будет перезаписано значением указанным в этом методе. */
    @PostConstruct
    public void init() {
        this.name = "Kikimorov";
    }

    /* На @PreDestroy нельзя "вешать" важные действия(например: закрытие соединения с БД),
     потому что попытка очистить контекст может оказаться неудачной. */
    /* В этом сценарии, при закрытии контекста, @PreDestroy отрабатывает три раза,
      потому что у нас имеется три бина использующих попугая(класс Parrot). */
    @PreDestroy
    public void usePreDestroy() {
        System.out.println("Попугай как бы всё!...");
    }
}
