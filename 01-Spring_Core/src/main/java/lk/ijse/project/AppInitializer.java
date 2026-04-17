package lk.ijse.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lk.ijse.project.bean.MyConnection;
import lk.ijse.project.bean.TestBean01;
import lk.ijse.project.bean.TestBean02;
import lk.ijse.project.config.AppConfig;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

    /*    SpringBean bean = context.getBean(SpringBean.class);
        bean.test();
        SpringBean bean2 = context.getBean(SpringBean.class);
        bean2.test();


        TestBean01 bean01 = context.getBean(TestBean01.class);
        System.out.println(bean01);*/


//        /*class name*/
//        SpringBean springBean = context.getBean(SpringBean.class);
//        System.out.println(springBean);
//
//        /*ID*/
//        TestBean01 testBean01 = context.getBean("testBean01",TestBean01.class);
//        System.out.println(testBean01);
//
//        /*Bean Id and Class Name*/
//        TestBean02 testBean2 = context.getBean("testBean01",TestBean02.class);
//        System.out.println(testBean2);

     /*   *//*bean Id -> bean method name*//*
        MyConnection connection = (MyConnection) context.getBean("getConnection");
        System.out.println(connection);
        *//*beanId + class name*//*
        MyConnection connection2 = (MyConnection) context.getBean("getConnection",MyConnection.class);
        System.out.println(connection2);
*/


       /*----------Method 01 --------------------------

       Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                context.close();
            }
        });*/
     /*   *//*-------Method 02------------------------*//*
        context.registerShutdownHook();

        TestBean02 bean02 = context.getBean(TestBean02.class);
        System.out.println(bean02);*/


        /*Checking the default behaviour of context/bean annotations*/
        TestBean01 bean01 = context.getBean(TestBean01.class);
        TestBean02 bean02 = context.getBean(TestBean02.class);
        System.out.println(bean01);
        System.out.println(bean02);

        MyConnection myConnection1 = context.getBean(MyConnection.class);
        MyConnection myConnection2 = context.getBean(MyConnection.class);
        System.out.println(myConnection1);
        System.out.println(myConnection2);

        context.registerShutdownHook();
    }
}