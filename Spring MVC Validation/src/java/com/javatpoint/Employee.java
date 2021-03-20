package com.javatpoint;  
import com.javatpoint.customvalidation.Password;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;  
  
public class Employee {  
  
    private String name;  
    
//    @Pattern(regexp="^[a-zA-Z0-9]{3}", message="length must be 3")  
//    @Size(min=3, message="password required (length must be 6)")  
    @Password // must contain jtp inside password text
    private String pass;  
      
    public String getName() {  
        return name;  
    }  
    
    public void setName(String name) {  
        this.name = name;  
    }
      
    public String getPass() {  
        return pass;  
    }
      
    public void setPass(String pass) {  
        this.pass = pass;  
    }     
}  
