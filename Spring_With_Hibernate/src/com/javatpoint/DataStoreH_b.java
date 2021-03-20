//package com.javatpoint;
//
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
///**
// *
// * @author suse
// */
//public class DataStoreH_b {
//    
//    public static void main(String[] args) {
//        
//        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//
//         Session session = factory.openSession();
//
//        Transaction tx = session.beginTransaction();
//        
//
//        Employee e=new Employee();  
//        e.setId(114);  
//        e.setName("varun");  
//        e.setSalary(50000);  
//
//         session.save(e);
//
//         tx.commit();
//         System.out.println("successfully saved"); 
//         session.close();
//        factory.close();
//    }
//}
