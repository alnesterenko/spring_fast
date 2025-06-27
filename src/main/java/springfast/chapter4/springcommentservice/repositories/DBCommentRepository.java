package springfast.chapter4.springcommentservice.repositories;

import org.springframework.stereotype.Repository;
import springfast.chapter4.springcommentservice.model.Comment;

/*
 * С помощью аннотации @Repository мы показываем,
 *  что этот объект является компонентом, исполняющим обязанность репозитория
 *
 * Репозитории — объекты, отвечающие за сохранность данных.
 *
 * Таким образом мы явно обозначаем обязанность компонента,
 *  благодаря чему структура классов становится более понятной и удобной для чтения.
 * */
@Repository
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
