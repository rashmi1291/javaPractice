package interview.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparator {

    public static void main(String args[]) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jack", 30000));
        employeeList.add(new Employee("Zara", 20000));
        employeeList.add(new Employee("Mike", 60000));
        employeeList.add(new Employee("Sara", 80000));

        // Using Comparator interface
         Collections.sort(employeeList, new SalaryComparator());
         System.out.println("Sorted list based on salary using Comparator");
         for(Employee emp:employeeList ){
         System.out.println(emp.employeeName+ " "+ emp.salary);
         }

        // Using Comparable interface
        Collections.sort(employeeList);
        System.out.println("Sorted list based on salary using Comparable");
        for (Employee emp : employeeList) {
            System.out.println(emp.employeeName + " " + emp.salary);
        }
    }

}
