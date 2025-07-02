package springfast.chapter5.normalpractice.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import springfast.chapter5.normalpractice.model.Comment;
import springfast.chapter5.normalpractice.repository.CommentRepository;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    private Comment comment;

    @Autowired
    private CommentRepository commentRepository;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment() {
        /* Изменение атрибута comment */
    }

    public void validateComment() {
        /* Валидация и изменение атрибута comment */
    }
}
