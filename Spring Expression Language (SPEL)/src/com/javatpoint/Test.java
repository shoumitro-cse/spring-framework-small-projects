package com.javatpoint;


import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
import org.springframework.expression.spel.support.StandardEvaluationContext;
  
public class Test {
    
    public static void main(String[] args) {  
        
        ExpressionParser parser = new SpelExpressionParser();  

        Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");   
        String message = (String) exp.getValue(String.class);  
        System.out.println(message);  
        
        Expression exp1 = parser.parseExpression("'Hello World'.bytes"); 
        
        byte[] bytes = (byte[]) exp1.getValue();  
        
        for(int i=0;i<bytes.length;i++) {  
            System.out.println((char)bytes[i]+" ");  
        }
        
        //arithmetic operator  
        System.out.println(parser.parseExpression("'Welcome SPEL'+'!'").getValue());  
        System.out.println(parser.parseExpression("10 * 10/2").getValue());  
        System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());  

        //logical operator  
        System.out.println(parser.parseExpression("true and true").getValue());  

        //Relational operator  
        System.out.println(parser.parseExpression("'sonoo'.length()==5").getValue());
        
        Calculation calculation=new Calculation();  
        StandardEvaluationContext context=new StandardEvaluationContext(calculation);  

      //  ExpressionParser parser = new SpelExpressionParser();  
        parser.parseExpression("number").setValue(context,"5");  

        System.out.println(calculation.cube());  
        
    }  
}  

 class Calculation { 
     
    private int number;  
    
    public int getNumber() {  
        return number;  
    }  
    public void setNumber(int number) {  
        this.number = number;  
    }  
    public int cube(){  
        return number*number*number;  
    }  
}  
