package com.workintech.Company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeesList = new LinkedList<>();

        // 4- 6- 8 aynı olacak.


        employeesList.add(new Employee(1,"Burak","CEVIZLI"));
        employeesList.add( new Employee(2,"Mehmet","SULEYMANOGLU"));
        employeesList.add(new Employee(3,"ALI","CABBAR"));
        employeesList.add(new Employee(4,"Seastian","VETTEL"));
        employeesList.add(new Employee(5,"Xavi","ALONSO"));
        employeesList.add(new Employee(4,"Seastian","VETTEL"));
        employeesList.add(new Employee(7,"ISIM 7","SOYISIM 7"));
        employeesList.add(new Employee(4,"Seastian","VETTEL"));
        employeesList.add(new Employee(9,"ASDASD","DSFSDFSDFSD"));
        employeesList.add(new Employee(10,"HGHFGHFGHFGH","GHJGHJGHJGHJGHJ"));

        Map<Integer , Employee> uniqueEmployees  = new HashMap<>();
        Map<Integer , Employee> replayedEmployees  = new HashMap<>();

        //Burası tekrar etmeyen.ve tekrar eden

        for(Employee employee : employeesList){
            if(!uniqueEmployees.containsKey(employee.getId())){
                uniqueEmployees.put(employee.getId(),employee);
            }else{
                replayedEmployees.put(employee.getId(), employee);
            }
        }

        Iterator<Employee> iterator = employeesList.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(Collections.frequency(employeesList,employee)> 1){
                iterator.remove();
            }
        }

        System.out.println(employeesList);


    }
}