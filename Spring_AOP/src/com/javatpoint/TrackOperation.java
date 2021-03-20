package com.javatpoint;  
  
import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.aspectj.lang.annotation.Pointcut;  
  
@Aspect  
public class TrackOperation {  
    
//    @AfterReturning(pointcut = "execution(* Operation.*(..))", returning= "result")             
    public void myadvice(JoinPoint jp, Object result) {  
       //it is advice (after returning advice)  
        System.out.println("additional concern");  
        System.out.println("Method Signature: "  + jp.getSignature());  
        System.out.println("Result in advice: "+result);  
        System.out.println("end of after returning advice...");  
    }  
}  


//    There are two ways to use Spring AOP AspectJ implementation:
//
//    By annotation: We are going to learn it here.
//    By xml configuration (schema based): We will learn it in next page.
//    To understand the aop concepts, its advantage etc. visit here AOP Concepts Tutorial
//    download all examples (developed using MyEclipse IDE)
//    Spring AspectJ AOP implementation provides many annotations:
//
//
//    @Aspect declares the class as aspect.
//    @Pointcut declares the pointcut expression.
//    The annotations used to create advices are given below:
//
//    @Before declares the before advice. It is applied before calling the actual method.
//    @After declares the after advice. It is applied after calling the actual method and before returning result.
//    @AfterReturning declares the after returning advice. It is applied after calling the actual method and before returning result. But you can get the result value in the advice.
//    @Around declares the around advice. It is applied before and after calling the actual method.
//    @AfterThrowing declares the throws advice. It is applied if actual method throws exception.
//
//
//    Understanding Pointcut
//    Pointcut is an expression language of Spring AOP.
//
//    The @Pointcut annotation is used to define the pointcut. We can refer the pointcut expression by name also. Let's see the simple example of pointcut expression.
//
//    @Pointcut("execution(* Operation.*(..))")  
//    private void doSomething() {}  
//    The name of the pointcut expression is doSomething(). It will be applied on all the methods of Operation class regardless of return type.

//    Understanding Pointcut Expressions
//    Let's try the understand the pointcut expressions by the examples given below:
//
//    @Pointcut("execution(public * *(..))")  
//    It will be applied on all the public methods.
//
//    @Pointcut("execution(public Operation.*(..))")  
//    It will be applied on all the public methods of Operation class.
//
//    @Pointcut("execution(* Operation.*(..))")  
//    It will be applied on all the methods of Operation class.
//
//    @Pointcut("execution(public Employee.set*(..))")  
//    It will be applied on all the public setter methods of Employee class.
//
//    @Pointcut("execution(int Operation.*(..))")  
//    It will be applied on all the methods of Operation class that returns int value.

