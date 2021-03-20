/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");

        Employee emp1 = new Employee(101, "Samir Pal", 2000f);
        dao.saveEmployeeByPreparedStatement(emp1);

        List<Employee> list = dao.getAllEmployees();
        for (Employee e : list) {
            System.out.println("Name : " + e.getName());
        }

//        dao1.update(new Employee(101,"Raj",90000));  

//        dao1.save(new Employee(101,"Rahim",32000));  


//        int status1 = dao.updateEmployee(new Employee(101,"Sonoo",15000)); 
//        System.out.println(status1); 
//         
//
//        Employee e=new Employee(); 
//        e.setId(101); 
//        int status2=dao.deleteEmployee(e); 
//        System.out.println(status2);


//       List<Employee> list = dao.getAllEmployeesRowMapper();
//       for(Employee e : list)
//            System.out.println("Name : "+e.getName());
    }

}
