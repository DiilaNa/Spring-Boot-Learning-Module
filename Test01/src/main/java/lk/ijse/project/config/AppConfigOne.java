package lk.ijse.project.config;

import lk.ijse.project.bean.E;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "lk.ijse.project.bean")
@Import({AppConfig1.class,AppConfig2.class})
@ImportResource("classpath:hibernate.cfg.xml") /*imported hibernate*/
public class AppConfigOne {
    @Bean
    public E e() {
        return new E();
    }
}
