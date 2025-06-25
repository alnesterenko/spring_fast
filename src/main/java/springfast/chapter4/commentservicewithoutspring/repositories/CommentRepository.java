package springfast.chapter4.commentservicewithoutspring.repositories;

import springfast.chapter4.commentservicewithoutspring.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
