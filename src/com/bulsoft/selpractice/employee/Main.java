package com.bulsoft.selpractice.employee;

public class Main {
    public static void main(String[] args) {
        EmployeManagement management = new EmployeManagement();

        // Everytime you create a employee
        // auto assign a employee id;

        management.hireEmployee(new Employee("Vivek"));
        management.hireEmployee(new Employee("Atin")); //@w763636
        management.hireEmployee(new Employee("Ivan"));
        management.hireEmployee(new Employee("Jal"));
        Employee emp = new Employee("Jay");
        management.hireEmployee(emp);
        management.hireEmployee(emp);

        management.printAllEmployee();

        System.out.println("---------------------------");
        management.printUniqueEmployees();

    }
}
