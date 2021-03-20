package com.javatpoint;  
import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  
  
@XmlRootElement(name="employee")  
public class Employee {  
    
    private int id;  
    private String names;  
    private float salary;  
    private String contacts;
 

    
    @XmlAttribute(name="id")  
    public int getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
 
     @XmlElement(name="name")  
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
    
    @XmlElement(name="salary")  
    public float getSalary() {  
        return salary;  
    }  
    public void setSalary(float salary) {  
        this.salary = salary;  
    } 

     @XmlElement(name="contract")  
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
    
    
}  