package springfast.chapter5.nowcreated.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter5.nowcreated.configuration.ProgectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProgectConfig.class);
    }
}
