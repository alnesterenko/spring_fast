package springfast.chapter4.commentservicewithoutspring.services;

import springfast.chapter4.commentservicewithoutspring.model.Comment;
import springfast.chapter4.commentservicewithoutspring.proxies.CommentNotificationProxy;
import springfast.chapter4.commentservicewithoutspring.repositories.CommentRepository;

public class CommentService {

    private final CommentRepository commentRepository;

    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
