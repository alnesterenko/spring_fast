package springfast.chapter6.sympleaspect.services;

import org.springframework.stereotype.Service;
import springfast.chapter6.sympleaspect.model.Comment;

import java.util.logging.Logger;


@Service
public class CommentService {

    /* Мы внедрили объект logger, чтобы каждый раз, когда выполняется сценарий использования,
     выводилось сообщение в консоль приложения */
    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        /* В этом методе определяется сценарий использования для нашей демонстрации */
        logger.info("Publishing comment: " + comment.getText());
    }
}
