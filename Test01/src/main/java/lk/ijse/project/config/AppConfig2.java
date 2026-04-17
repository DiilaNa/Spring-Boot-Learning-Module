package lk.ijse.project.config;

import lk.ijse.project.bean.C;
import lk.ijse.project.bean.D;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
    @Bean
    public C c() {
        return new C();

    }
    @Bean
    public D d() {
        return new D();
    }
}
