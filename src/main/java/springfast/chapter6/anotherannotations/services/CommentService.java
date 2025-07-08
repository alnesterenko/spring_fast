package springfast.chapter6.anotherannotations.services;

import org.springframework.stereotype.Service;
import springfast.chapter6.anotherannotations.aspects.ToLog;
import springfast.chapter6.anotherannotations.model.Comment;

import java.util.logging.Logger;


@Service
public class CommentService {

    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    /* Мы создали СВОЮ аннотацию и отметили ей метод, который должен перехватываться. */
    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment: " + comment.getText());
    }
}
