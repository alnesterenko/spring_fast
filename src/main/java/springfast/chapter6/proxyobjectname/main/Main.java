package springfast.chapter6.proxyobjectname.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter6.proxyobjectname.configuration.ProjectConfig;
import springfast.chapter6.proxyobjectname.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);
        System.out.println(service.getClass());
    }
}
