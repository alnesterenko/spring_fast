package springfast.chapter4.springcommentservice.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springfast.chapter4.springcommentservice.model.Comment;

/*
 *Если в Spring нет специальной аннотации для данной обязанности, продолжаем использовать @Component
 **/
@Component
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
        + comment.getText());
    }
}
