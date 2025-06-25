package springfast.chapter4.springcommentservice.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springfast.chapter4.springcommentservice.configuration.ProjectConfiguration;
import springfast.chapter4.springcommentservice.model.Comment;
import springfast.chapter4.springcommentservice.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
