package springfast.chapter6.aspectchains.withoutorder.services;

import org.springframework.stereotype.Service;
import springfast.chapter6.aspectchains.withoutorder.aspects.ToLog;
import springfast.chapter6.aspectchains.withoutorder.model.Comment;

import java.util.logging.Logger;


@Service
public class CommentService {

    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public Object publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS!";
    }
}
