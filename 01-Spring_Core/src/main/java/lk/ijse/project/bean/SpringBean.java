package lk.ijse.project.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("SpringBean Constructor");
    }
    public void test(){
        System.out.println("test");
    }
}
