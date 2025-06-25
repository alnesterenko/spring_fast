package springfast.chapter4.commentservicewithoutspring.repositories;

import springfast.chapter4.commentservicewithoutspring.model.Comment;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
