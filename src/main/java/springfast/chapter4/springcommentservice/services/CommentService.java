package springfast.chapter4.springcommentservice.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springfast.chapter4.springcommentservice.model.Comment;
import springfast.chapter4.springcommentservice.proxies.CommentNotificationProxy;
import springfast.chapter4.springcommentservice.repositories.CommentRepository;

@Component
public class CommentService {

    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    /*
     * !!! Если в классе только один конструктор, то анотация @Autowired не обязательна !!!
     * */
    public CommentService(CommentRepository commentRepository,
                          /* Каждый параметр, для которого нужно использовать специальную реализацию, сопровождается аннотацией @Qualifier */
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
