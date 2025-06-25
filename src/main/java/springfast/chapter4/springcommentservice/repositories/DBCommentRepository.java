package springfast.chapter4.springcommentservice.repositories;

import org.springframework.stereotype.Component;
import springfast.chapter4.springcommentservice.model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
