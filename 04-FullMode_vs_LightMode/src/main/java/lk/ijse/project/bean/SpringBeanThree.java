package lk.ijse.project.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanThree {
    @Bean
    public SpringBeanOne springBeanOne() {
        SpringBeanTwo springBeanOne1 = new SpringBeanTwo();
        SpringBeanTwo springBeanTwo2 = new SpringBeanTwo();
        System.out.println(springBeanOne1);
        System.out.println(springBeanTwo2);
        return new SpringBeanOne();
    }
    @Bean
    public SpringBeanTwo springBeanTwo() {
        return new SpringBeanTwo();
    }
}
