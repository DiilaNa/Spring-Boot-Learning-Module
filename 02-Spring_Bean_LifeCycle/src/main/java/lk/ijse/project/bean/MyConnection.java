package lk.ijse.project.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements DisposableBean, BeanNameAware , BeanFactoryAware , ApplicationContextAware ,InitializingBean {
    /*The state of instantiation*/

    public MyConnection() {
        System.out.println("MyConnection constructor is called");
    }

    /*There is no method to find the state of populate properties*/


    /*bean name aware*/
    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName is called");
    }
    /* bean Factory aware - dependency injections are added to bean*/
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory is Called");
    }
    /*Aspect oriented programming and declarative programming satisfied*/
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext is called");
    }
    /*Bean is ready to use*/
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet is called/Bean is ready to use");
    }
    /*Disposable bean aware*/
    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection is Destroyed");
    }
}
