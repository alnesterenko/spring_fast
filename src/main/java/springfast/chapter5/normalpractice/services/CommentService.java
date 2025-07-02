package springfast.chapter5.normalpractice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import springfast.chapter5.normalpractice.model.Comment;
import springfast.chapter5.normalpractice.processors.CommentProcessor;

/*
* Не следует внедрять CommentProcessor непосредственно в бин CommentService — это было бы ошибкой.
*  Бин CommentService является одиночным, а следовательно, Spring создает только один экземпляр этого класса.
*  Таким образом, при создании бина CommentService Spring сразу внедрит и все зависимости класса.
*  В итоге получим единственный экземпляр CommentProcessor.
*  И этот уникальный(единственный) экземпляр будет использоваться при каждом вызове метода sendComment() !!!
* */

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment comment) {
        CommentProcessor commentProcessor = context.getBean(CommentProcessor.class); /* Каждый раз новый экземпляр */
        commentProcessor.setComment(comment);
        commentProcessor.processComment();
        commentProcessor.validateComment();
        comment = commentProcessor.getComment(); /* Получаем изменённый экземпляр Comment и используем его дальше */
        /* Делаем что-то ещё */
    }
}

/* Неправильный вариант! Плохая практика! */
/*
* @Service
* public class CommentService {
*
*   @Autowired
* // Spring внедряет этот бин при создании бина CommentService.
* // Однако, поскольку CommentService является одиночным бином,
* // Spring также сразу создаст и внедрит бин CommentProcessor
*   private CommentProcessor commentProcessor;
*
*   public void sendComment(Comment comment) {
*   CommentProcessor commentProcessor = context.getBean(CommentProcessor.class);
*   commentProcessor.setComment(comment);
*   commentProcessor.processComment();
*   commentProcessor.validateComment();
*   comment = commentProcessor.getComment();
*   // Делаем что-нибудь ещё
*   }
*           }
* */
