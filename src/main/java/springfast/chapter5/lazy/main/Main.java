package springfast.chapter5.lazy.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter5.lazy.configuration.ProgectConfig;
import springfast.chapter5.lazy.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProgectConfig.class);

        System.out.println("Before retrieving the CommentService");
        var service = context.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}
