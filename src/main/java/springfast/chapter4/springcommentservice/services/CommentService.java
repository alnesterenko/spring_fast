package springfast.chapter4.springcommentservice.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import springfast.chapter4.springcommentservice.model.Comment;
import springfast.chapter4.springcommentservice.proxies.CommentNotificationProxy;
import springfast.chapter4.springcommentservice.repositories.CommentRepository;

/*
* С помощью аннотации @Service мы показываем,
*  что этот объект является компонентом, исполняющим обязанность сервиса
 *
 * Сервисы — объекты, задачей которых является реализация сценариев использования.
 *
 * Таким образом мы явно обозначаем обязанность компонента,
 *  благодаря чему структура классов становится более понятной и удобной для чтения.
 * */
@Service
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
