    package lk.ijse.project.bean;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Qualifier;
    import org.springframework.context.annotation.Primary;
    import org.springframework.stereotype.Component;

    @Component
    public class Boy{

        @Qualifier("girl01")
        @Autowired /*Runtime Dependency is injected-object creation without a new keyword*/
                Agreement girl;

        public Boy() {
            System.out.println("Boy Constructor");
        }
        public void chatWithGirl(){
            girl.chat();
        }
    }
