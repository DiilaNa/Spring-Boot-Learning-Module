package lk.ijse.project.config;

import lk.ijse.project.bean.SpringBeanOne;
import lk.ijse.project.bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration/*context ekata bean wetenna ooni kohmd kiyl kiynne*/
@ComponentScan(basePackages = "lk.ijse.project.bean")
public class AppConfig {
  /*  @Bean
    public SpringBeanOne springBeanOne() {
        SpringBeanTwo springBeanOne1 = springBeanTwo();
        SpringBeanTwo springBeanTwo2 = springBeanTwo();
        System.out.println(springBeanOne1);
        System.out.println(springBeanTwo2);
        return new SpringBeanOne();
    }
    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }*/
}


