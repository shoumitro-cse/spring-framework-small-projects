/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author suse
 */
public class Test {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Operation e = (Operation) context.getBean("opBean");  
        
        System.out.println("\n\ncalling msg...");  
        e.msg();
        
        System.out.println("\n\ncalling m...");  
        e.m();  
        
        System.out.println("\n\ncalling k...");  
        e.k();
        
//        System.out.println("\n\ncalling validation...");  
//        try {
//            e.validate(3);
//        } catch (Exception ex) {
//            System.err.println("Error: ");
//        }
    }
}

 

//    Where use AOP?
//
//    AOP Concepts and Terminology
//    Spring AOP Implementation
//    Aspect Oriented Programming (AOP) compliments OOPs in the sense that it also provides modularity. 
//    But the key unit of modularity is aspect than class.
//
//    AOP breaks the program logic into distinct parts (called concerns). It is used to increase modularity 
//    by cross-cutting concerns.
//
//    A cross-cutting concern is a concern that can affect the whole application and should be centralized 
//    in one location in code as possible, such as transaction management, authentication, logging, 
//    security etc.
//
//
//    Why use AOP?
//    It provides the pluggable way to dynamically add the additional concern before, after or around the 
//    actual logic. Suppose there are 10 methods in a class as given below:
//
//    class A {  
//        public void m1(){...}  
//        public void m2(){...}  
//        public void m3(){...}  
//        public void m4(){...}  
//        public void m5(){...}  
//        public void n1(){...}  
//        public void n2(){...}  
//        public void p1(){...}  
//        public void p2(){...}  
//        public void p3(){...}  
//    }  
//    There are 5 methods that starts from m, 2 methods that starts from n and 3 methods that starts from p.
//
//    Understanding Scenario I have to maintain log and send notification after calling methods that starts 
//    from m.
//
//    Problem without AOP We can call methods (that maintains log and sends notification) from the methods 
//    starting with m. In such scenario, we need to write the code in all the 5 methods.
//
//    But, if client says in future, I don't have to send notification, you need to change all the methods. 
//    It leads to the maintenance problem.
//
//    Solution with AOP We don't have to call methods from the method. Now we can define the additional 
//    concern like maintaining log, sending notification etc. in the method of a class. Its entry is given 
//    in the xml file.
//
//    In future, if client says to remove the notifier functionality, we need to change only in the xml file.
//    So, maintenance is easy in AOP.
//
//
