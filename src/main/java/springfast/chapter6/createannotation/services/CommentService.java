package springfast.chapter6.createannotation.services;

import org.springframework.stereotype.Service;
import springfast.chapter6.createannotation.model.Comment;

import java.util.logging.Logger;


@Service
public class CommentService {

    /* Мы внедрили объект logger, чтобы каждый раз, когда выполняется сценарий использования,
     выводилось сообщение в консоль приложения */
    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }
}
