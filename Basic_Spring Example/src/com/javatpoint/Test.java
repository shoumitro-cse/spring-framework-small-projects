package com.javatpoint;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("\n\n.........For Student..................");
        Student student = (Student) context.getBean("studentbean");
        student.displayInfo();

        System.out.println("\n\n.........For Employee..................");
        Employee e = (Employee) context.getBean("emp");
        e.show();

        System.out.println("\n\n...........For Question................");
        Question q = (Question) context.getBean("q");
        q.displayInfo();

//
//        Resource resource=new ClassPathResource("applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        
//        // 2nd way
////        Resource resource=new ClassPathResource("applicationContext.xml");
////        BeanFactory factory = new XmlBeanFactory(resource);
//
//        Employee e2 = (Employee) factory.getBean("emp", Employee.class);
//        e2.show();
//
//        System.out.println("................................");
//        A a = factory.getBean("obj", A.class);
////        A a = context.getBean("proxy", A.class);
//        //  System.out.println("proxy class name: "+a.getClass().getName());  
//        a.m();
//
//        try {
//            a.validate(12);
//        } catch (Exception ex) {
//            // Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//           // ex.printStackTrace();
//            System.err.println("Error: Age must be greater than 18");
//        }
    }
}
