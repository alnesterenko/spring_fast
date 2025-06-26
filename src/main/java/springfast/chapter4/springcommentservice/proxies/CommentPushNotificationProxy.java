package springfast.chapter4.springcommentservice.proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfast.chapter4.springcommentservice.model.Comment;

@Component
@Primary
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: "
        + comment.getText());
    }
}
