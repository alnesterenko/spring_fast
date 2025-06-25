package springfast.chapter4.springcommentservice.proxies;

import springfast.chapter4.springcommentservice.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment);
}
