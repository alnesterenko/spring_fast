package springfast.chapter5.prototypebeans.bean.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter5.prototypebeans.bean.configuration.ProjectConfig;
import springfast.chapter5.prototypebeans.bean.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /* При создании нового бина с прототипной областью видимости, создаётся новый экземпляр */
        var commentService1 = context.getBean("commentService", CommentService.class);
        var commentService2 = context.getBean("commentService", CommentService.class);

        boolean seim = commentService1 == commentService2;
        System.out.println(seim);
    }
}
