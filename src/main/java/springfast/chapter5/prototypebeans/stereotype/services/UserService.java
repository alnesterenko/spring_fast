package springfast.chapter5.prototypebeans.stereotype.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springfast.chapter5.prototypebeans.stereotype.repositories.CommentRepository;

@Service
public class UserService {
    @Autowired
    private CommentRepository commentRepository;

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
