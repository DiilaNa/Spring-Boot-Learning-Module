package lk.ijse.project.config;

import lk.ijse.project.bean.A;
import lk.ijse.project.bean.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
  @Bean
    public A a(){
      return new A();
  }
  @Bean
    public B b(){
      return new B();
  }
}
