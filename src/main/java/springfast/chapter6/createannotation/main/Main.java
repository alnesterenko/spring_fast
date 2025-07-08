package springfast.chapter6.createannotation.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter6.createannotation.configuration.ProjectConfig;
import springfast.chapter6.createannotation.model.Comment;
import springfast.chapter6.createannotation.services.CommentService;

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
