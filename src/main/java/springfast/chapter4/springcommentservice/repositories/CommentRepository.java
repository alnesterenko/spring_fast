package springfast.chapter4.springcommentservice.repositories;

import springfast.chapter4.springcommentservice.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
