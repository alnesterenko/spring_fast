package springfast.chapter6.value.capture.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter6.value.capture.configuration.ProjectConfig;
import springfast.chapter6.value.capture.model.Comment;
import springfast.chapter6.value.capture.services.CommentService;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment("Natasha", "Demo comment");
        String value = service.publishComment(comment);
        /* Вывести значение, возвращаемое методом publishComment() */
        logger.info(value);
    }
}
