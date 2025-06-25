package springfast.chapter4.springcommentservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springfast.chapter4.springcommentservice.model.Comment;
import springfast.chapter4.springcommentservice.proxies.CommentNotificationProxy;
import springfast.chapter4.springcommentservice.repositories.CommentRepository;

@Component
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
