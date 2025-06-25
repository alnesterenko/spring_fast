package springfast.chapter4.commentservicewithoutspring.main;

import springfast.chapter4.commentservicewithoutspring.model.Comment;
import springfast.chapter4.commentservicewithoutspring.proxies.EmailCommentNotificationProxy;
import springfast.chapter4.commentservicewithoutspring.repositories.DBCommentRepository;
import springfast.chapter4.commentservicewithoutspring.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}
