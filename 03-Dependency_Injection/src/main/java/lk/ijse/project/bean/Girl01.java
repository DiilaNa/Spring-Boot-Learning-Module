package lk.ijse.project.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl01 implements Agreement {
    public Girl01() {
        System.out.println("Girl 01 Constructor");
    }

    @Override
    public void chat() {
        System.out.println("Girl 01 is Chatting");
    }


}
