package lk.ijse.project.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) /*singleton behaviour is changed / two different ids for TestBeans*/
public class TestBean01 {
    public TestBean01() {
        System.out.println("TestBean01 Constructor");
    }
}
