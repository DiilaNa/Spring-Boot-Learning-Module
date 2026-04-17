package lk.ijse.project.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanOne implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean { /*api hadana class ekk neme meka 3rd party ekk/component annototaion ek dmmama tma api hadana class ekk wenne*/
    public SpringBeanOne() {
        System.out.println("SpringBean One Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("SpringBean One setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SpringBean One setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean One destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("SpringBean One afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("SpringBean One setApplicationContext");
    }
}
