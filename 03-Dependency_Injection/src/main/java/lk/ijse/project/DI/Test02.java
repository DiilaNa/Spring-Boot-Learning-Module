package lk.ijse.project.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test02 implements DIInterface {
    /*property injection*/
    @Autowired
    DI di;
 /*   *//*Constructor through injection-no need for auto wired annotation for constructor*//*
    public Test02(DI di) {
       this.di = di;
    }*/

 /*  *//*Setter Method Through Injection*//*
   @Autowired
    public void setDi(DI di) {
        this.di = di;
    }*/

    public  void test() {
        di.sayHello();
    }
   /*Interface through injection*/
   @Autowired
    @Override
    public void injected(DI test1) {
        this.di = test1;
    }
}
