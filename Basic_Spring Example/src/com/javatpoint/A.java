/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint;

public class A { 
    
    public void m() {
        System.out.println("Here, actual business logic");
    } 
    
    public void validate(int age)throws Exception {  
       if(age<18) {  
           throw new ArithmeticException("Not Valid Age");  
       } else { 
           System.out.println("vote confirmed");  
       }  
   }  
    
} 