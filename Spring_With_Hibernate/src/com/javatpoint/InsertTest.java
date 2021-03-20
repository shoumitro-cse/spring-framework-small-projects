package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {

    public static void main(String[] args) {

        
//        Resource r = new ClassPathResource("applicationContext.xml");
//        BeanFactory factory = new XmlBeanFactory(r);
//        EmployeeDao dao = (EmployeeDao) factory.getBean("d");

        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("d");

        Employee e = new Employee();
        e.setId(114);
        e.setName("varun");
        e.setSalary(50000);

        dao.saveEmployee(e);

    }
}
