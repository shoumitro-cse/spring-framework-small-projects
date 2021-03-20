package com.javatpoint;

public class Employee {

    private int id;
    private String name;
    private float salary;
    private String contracts_emp;

    public String getContracts_emp() {
        return contracts_emp;
    }

    public void setContracts_emp(String contracts_emp) {
        this.contracts_emp = contracts_emp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
