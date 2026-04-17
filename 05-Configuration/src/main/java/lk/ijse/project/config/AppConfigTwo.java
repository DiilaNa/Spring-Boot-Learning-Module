package lk.ijse.project.config;

import lk.ijse.project.bean.SpringBeanOne;
import lk.ijse.project.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*
@ComponentScan(basePackages = "lk.ijse.project.bean")
*/
public class AppConfigTwo {
    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }

}
