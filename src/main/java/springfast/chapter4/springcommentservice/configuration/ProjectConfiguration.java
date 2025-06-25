package springfast.chapter4.springcommentservice.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
* !!! В basePackages нужно указывать полный путь до пакета, начиная после папки java(не включительно) !!!
* */
@Configuration
@ComponentScan(basePackages = {"springfast.chapter4.springcommentservice.proxies",
        "springfast.chapter4.springcommentservice.services",
        "springfast.chapter4.springcommentservice.repositories"})
public class ProjectConfiguration {
}
