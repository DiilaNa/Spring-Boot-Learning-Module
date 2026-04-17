package lk.ijse.project.config;

import lk.ijse.project.bean.MyConnection;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.project.bean")/*tell where thr beans are*/
public class AppConfig {
    @Bean("getConnection")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)/*singleton behaviour is changed/two bean ids*/
    MyConnection myConnection(){
        return new MyConnection();
    }
}
