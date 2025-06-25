package springfast.chapter4.springcommentservice.proxies;

import org.springframework.stereotype.Component;
import springfast.chapter4.springcommentservice.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
        + comment.getText());
    }
}
