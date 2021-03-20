//package com.model;
//
//import java.util.List;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Test {
//
//    
////    This setion can not work because applicationContext can't find. this file can't exit src folder
//    public static void main(String[] args) {
//
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        EmployeeModel dao = (EmployeeModel) ctx.getBean("edao");
//
//        EmployeeBean emp1 = new EmployeeBean(101, "Samir Pal", 2000f);
//        dao.saveEmployeeByPreparedStatement(emp1);
//
//        List<EmployeeBean> list = dao.getAllEmployees();
//        for (EmployeeBean e : list) {
//            System.out.println("Name : " + e.getName());
//        }
//
////        dao1.update(new EmployeeBean(101,"Raj",90000));  
//
////        dao1.save(new EmployeeBean(101,"Rahim",32000));  
//
//
////        int status1 = dao.updateEmployee(new EmployeeBean(101,"Sonoo",15000)); 
////        System.out.println(status1); 
////         
////
////        EmployeeBean e=new EmployeeBean(); 
////        e.setId(101); 
////        int status2=dao.deleteEmployee(e); 
////        System.out.println(status2);
//
//
////       List<Employee> list = dao.getAllEmployeesRowMapper();
////       for(EmployeeBean e : list)
////            System.out.println("Name : "+e.getName());
//    }
//
//}
