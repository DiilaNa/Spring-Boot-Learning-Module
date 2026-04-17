package lk.ijse.project.config;

import lk.ijse.project.bean.MyConnection;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.project.bean")
public class AppConfig {
    @Bean
  /*  @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)*/
    public MyConnection myConnection() {
        return new MyConnection();
    }

}
