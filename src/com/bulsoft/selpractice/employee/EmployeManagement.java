package com.bulsoft.selpractice.employee;

import java.util.*;

/**
 * Where I will manage employess
 */
public class EmployeManagement {

   private List<Employee> employees = new ArrayList<>();
   private Set<Employee> employeeSet = new HashSet<>();

    public void hireEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void terminateEmployee(String name){
        Employee employee =null;
        for(Employee emp : employees){
            if(emp.getName().equals(name)){
                employee = emp;
            }
        }

        this.employees.remove(employee);

       // this.employees.remove();
    }

    public void printAllEmployee(){
        System.out.println(this.employees);
    }

    public void printUniqueEmployees(){
        employeeSet.addAll(employees);
        System.out.println(employeeSet);
    }


}
