package springfast.chapter6.value.change.services;

import org.springframework.stereotype.Service;
import springfast.chapter6.value.change.model.Comment;

import java.util.logging.Logger;


@Service
public class CommentService {

    /* Мы внедрили объект logger, чтобы каждый раз, когда выполняется сценарий использования,
     выводилось сообщение в консоль приложения */
    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        /* В этом методе определяется сценарий использования для нашей демонстрации */
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS!"; /* В демонстрационных целях теперь этот метод возвращает значение */
    }
}
