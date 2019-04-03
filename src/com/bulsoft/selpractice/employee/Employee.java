package com.bulsoft.selpractice.employee;

public class Employee {

    private String name;
    private boolean isActive;

    public Employee(String name) {
        this.name = name;
        this.isActive = true;
    }


    public void makeInActive(){
        this.isActive = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}

// in to string instead of true/false --print
// on-roll / ex-employee


// create list of employees
// add new employees
// remove