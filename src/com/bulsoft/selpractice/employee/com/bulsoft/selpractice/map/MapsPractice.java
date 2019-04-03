package com.bulsoft.selpractice.employee.com.bulsoft.selpractice.map;

import com.bulsoft.selpractice.employee.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsPractice {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Singh", "Atin Singh");
        employeeMap.put("Jay", "Jay Goswami");
        employeeMap.put("Jal", "Jal Patel");
        System.out.println(employeeMap);
        System.out.println("&&&&&&&&##&&&&&&&&&&&&&&&&&&&&");
        employeeMap.put("Jal", "Vivek Ghartan");
        employeeMap.put(null, null);
//
//        employeeMap.forEach((key,value)->{
//            System.out.println("Key is " + key);
//            System.out.println("Value is " + value);
//        });

         Set<String> keys = employeeMap.keySet();
         for (String key : keys){
             System.out.println(employeeMap.get(key));
         }

        System.out.println(employeeMap);

//        Map<String, Integer> integerStringMap  = new HashMap<>();
//        integerStringMap.put("java", 2);
//        integerStringMap.put("C++",3);





    }
}
