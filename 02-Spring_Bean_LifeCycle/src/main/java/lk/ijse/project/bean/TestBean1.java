package lk.ijse.project.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TestBean1 implements DisposableBean {
    public TestBean1() {
        System.out.println("TestBean1 Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TestBean1 destroy");
    }
}
