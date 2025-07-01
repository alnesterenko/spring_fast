package springfast.chapter5.prototypebeans.bean.configuration;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import springfast.chapter5.prototypebeans.bean.services.CommentService;

@Configuration
public class ProjectConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)/* Создание бина с прототипной областью видимости */
    public CommentService commentService() {
        return new CommentService();
    }
}
