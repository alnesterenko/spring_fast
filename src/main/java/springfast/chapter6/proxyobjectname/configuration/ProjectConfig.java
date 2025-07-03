package springfast.chapter6.proxyobjectname.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfast.chapter6.proxyobjectname.services.CommentService;

@Configuration
public class ProjectConfig {

    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}
