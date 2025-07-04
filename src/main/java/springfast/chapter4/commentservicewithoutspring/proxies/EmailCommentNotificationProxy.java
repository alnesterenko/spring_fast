package springfast.chapter4.commentservicewithoutspring.proxies;

import springfast.chapter4.commentservicewithoutspring.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
        + comment.getText());
    }
}
