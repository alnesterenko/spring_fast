package springfast.chapter5.prototypebeans.stereotype.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter5.prototypebeans.stereotype.configuration.ProjectConfig;
import springfast.chapter5.prototypebeans.stereotype.services.CommentService;
import springfast.chapter5.prototypebeans.stereotype.services.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service1 = context.getBean(CommentService.class);
        var service2 = context.getBean(UserService.class);

        /* Каждый из сервисов получает свой репозиторий */
        boolean same = service1.getCommentRepository() == service2.getCommentRepository();
        System.out.println(same);
    }
}
