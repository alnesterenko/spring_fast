package springfast.chapter6.aspectchains.withorder.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter6.aspectchains.withorder.configuration.ProjectConfig;
import springfast.chapter6.aspectchains.withorder.model.Comment;
import springfast.chapter6.aspectchains.withorder.services.CommentService;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment("Natasha", "Demo comment");
        service.publishComment(comment);
    }
}
