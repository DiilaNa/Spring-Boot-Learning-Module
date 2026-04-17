package lk.ijse.project.DI;

import org.springframework.stereotype.Component;

@Component
public class Test01 implements DI{
    private Test01() {
        System.out.println("Test01 Constructor");
    }

    @Override
    public void sayHello() {
        System.out.println("Test01 sayHello");
    }
}
