package com.javatpoint;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Host {  
    
    public static void main(String[] args) { 

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
        
         System.out.println("Server(rmi://localhost:1099/CalculationService) Waiting for requests");  
    } 

} 