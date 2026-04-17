package lk.ijse.project.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Girl02 implements Agreement{
    public Girl02() {
        System.out.println("Girl 02 constructor");
    }
    @Override
    public void chat(){
        System.out.println("Girl 02 is Chatting");
    }
}
