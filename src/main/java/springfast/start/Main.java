package springfast.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());

        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getName());

        String string = context.getBean(String.class);
        System.out.println(string);

        Integer integer = context.getBean(Integer.class);
        System.out.println(integer);

        Parrot x = new Parrot("Попугай добавленный программно из класса Main");
        String newParrotBeanName = "Имя бина добавленного программно";
        Supplier<Parrot> parrotSupplier = () -> x;

        /**
         * Метод добавляет бины в контекст "на лету".
         * @param newParrotBeanName -- это имя бина, добавляемого в контекст Spring.
         * Если вы не хотите присвоить имя бину присвойте этому параметру значение null.
         *
         * @param Parrot.class -- класс, который определяет бин, добавляемый в контекст.
         *
         * @param parrotSupplier -- это экземпляр Supplier.
         * Реализация Supplier нужна, чтобы возвращать значение экземпляра, добавляемого в контекст.
         * Supplier — это функциональный интерфейс. Назначение реализации Supplier состоит в том,
         * чтобы возвращать заданное значение, не принимая параметров.
         *
         * @param bs -> bs.setPrimary(false) - это аргумент переменной длины (varargs)BeanDefinitionCustomizer.
         * (BeanDefinitionCustomizer — просто еще один интерфейс,
         *  который используется для настройки различных свойств бина, например, чтобы сделать бин первичным.)
         *  Определив его как аргумент переменной длины, мы можем либо совсем пропустить этот параметр,
         *  либо присвоить ему несколько значений типа BeanDefinitionCustomizer.
         *  !!! Параметр не обязательный !!!
         */
        context.registerBean(newParrotBeanName,
                Parrot.class,
                parrotSupplier,
                bs -> bs.setPrimary(false)); /* Если уже есть @Primary бин, то добавление второго вызовет ошибку. */

        Parrot newParrot = context.getBean(newParrotBeanName, Parrot.class);
        System.out.println("Новый попугай: " + newParrot.getName());

        context.close();
    }
}