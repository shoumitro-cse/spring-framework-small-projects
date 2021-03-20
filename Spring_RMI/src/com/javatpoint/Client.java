package com.javatpoint;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Client {  
    
    
//    1. First run Host.java => It is a Host of client
//    2. Second run Client.java => It is a Client. Before Run Client must run host and don't close host        
    
    public static void main(String[] args)  {  
        
        ApplicationContext context = new ClassPathXmlApplicationContext("client-beans.xml"); 
        
        Calculation calculation = (Calculation)context.getBean("calculationBean");  
        
        System.out.println(calculation.cube(5));  // out 125
        
    } 

} 