package com.javatpoint;

public class Student {
    
private String name;
private int age;

    public Student(String name, int age) {
          System.out.println("both constructor age : "+age);
          System.out.println("both constructor Name : "+name);
    }

    public Student(int age) {
       System.out.println("constructor age : "+age);
    }

    public Student(String name) {
        System.out.println("constructor Name : "+name);
    }

    public Student() {
         System.out.println("default constructor ");
    }


    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public void displayInfo(){
            System.out.println("Hello: "+name);
    }
}
