package lk.ijse.project.config;

import lk.ijse.project.bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
@ComponentScan(basePackages = "lk.ijse.project.bean")
*/
public class AppConfigOne {
    @Bean
    public SpringBeanOne springBeanOne() {
        return new SpringBeanOne();
    }


}
