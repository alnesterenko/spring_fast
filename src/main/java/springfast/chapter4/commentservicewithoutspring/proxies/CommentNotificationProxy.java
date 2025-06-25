package springfast.chapter4.commentservicewithoutspring.proxies;

import springfast.chapter4.commentservicewithoutspring.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
