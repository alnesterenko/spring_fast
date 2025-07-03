package springfast.chapter6.sympleaspect.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter6.sympleaspect.services.CommentService;
import springfast.chapter6.sympleaspect.configuration.ProjectConfig;
import springfast.chapter6.sympleaspect.model.Comment;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment("Natasha", "Demo comment");
        service.publishComment(comment);
    }
}
