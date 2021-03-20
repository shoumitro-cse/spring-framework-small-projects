package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientInvoker {

    public static int getCube(int number) {
        ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");
        Calculation calculation = (Calculation) context.getBean("calculationBean");
        return calculation.cube(number);
    }

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml");

        Calculation calculation = (Calculation) context.getBean("calculationBean");

        System.out.println(calculation.cube(5));

    }

}
