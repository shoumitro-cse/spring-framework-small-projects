package com.javatpoint;  


import org.springframework.orm.hibernate3.HibernateTemplate;  
import java.util.*;  
import org.springframework.dao.DataAccessException;

public class EmployeeDao {  
    
    HibernateTemplate template;
    
    public void setTemplate(HibernateTemplate template) {  
        this.template = template;  
    }
    
    //method to save employee  
    public void saveEmployee(Employee e) throws DataAccessException{  
        template.save(e);  
    }  
    //method to update employee  
    public void updateEmployee(Employee e) throws DataAccessException{  
        template.update(e);  
    }  
    //method to delete employee  
    public void deleteEmployee(Employee e) throws DataAccessException{  
        template.delete(e);  
    }  
    //method to return one employee of given id  
    public Employee getById(int id) throws DataAccessException{  
        Employee e=(Employee)template.get(Employee.class,id);  
        return e;  
    }  
    //method to return all employees  
    public List<Employee> getEmployees() throws DataAccessException{  
        List<Employee> list=new ArrayList<Employee>();  
        list=template.loadAll(Employee.class);  
        return list;  
    }  
}  