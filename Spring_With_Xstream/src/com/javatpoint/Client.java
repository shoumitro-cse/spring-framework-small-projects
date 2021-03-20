package com.javatpoint;  
import java.io.FileWriter;  
import java.io.IOException;  
import javax.xml.transform.stream.StreamResult;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.oxm.Marshaller;  
  
public class Client {  
    
    public static void main(String[] args)throws IOException {  

     ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
  
     Marshaller marshaller = (Marshaller)context.getBean("xstreamMarshallerBean");  

     Employee employee = new Employee();  
     employee.setId(101);  
     employee.setNames("Sonoo Jaiswal");  
     employee.setSalary(100000); 
     employee.setContacts("2 Hours");

     marshaller.marshal(employee, new StreamResult(new FileWriter("/home/shoumitro/Documents/html_ex/Spring/X_Doc/employee.xml")));  

     System.out.println("XML Created Sucessfully"); 
     
   }  
}  