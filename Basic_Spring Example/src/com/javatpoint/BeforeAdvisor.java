/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
 *
 * @author suse
 */
//public class BeforeAdvisor implements ThrowsAdvice { 
//    
//      public void afterThrowing(Exception ex) {  
//        System.out.println("additional concern if exception occurs");  
//      }
//
////    @Override
////    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
////       System.out.println("additional concern after returning advice");  
////    }
//    
////    @Override  
////    public void before(Method method, Object[] args, Object target)throws Throwable {  
////        
////        System.out.println("additional concern before actual logic");  
////        System.out.println("method info: "+method.getName()+" "+method.getModifiers());  
////        
////        System.out.println("argument info:");  
////        for(Object arg : args)  
////            System.out.println(arg);  
////        
////        System.out.println("target Object:"+target);  
////        System.out.println("target object class name: "+target.getClass().getName());  
////
////    }  
////
////    @Override
////    public Object invoke(MethodInvocation mi) throws Throwable {
////        
////        Object obj;  
////        System.out.println("additional concern before actual logic");  
////        
////        obj=mi.proceed();  
////        
////        System.out.println("additional concern after actual logic");  
////        return obj;  
////    }
//}
