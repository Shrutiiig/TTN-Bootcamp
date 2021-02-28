// Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;

class Employee{
    String name = "";
    double age = 0.0;
    double salary = 0.0;

    public Employee(String name, double age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class sortSalary implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        if( e1.salary > e2.salary ) return 1;
        if( e1.salary < e2.salary ) return -1;
        return 0;
    }
}

public class ques4 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rohan",22.0,46000.00);
        Employee e2 = new Employee("Shreya",21.0,50000.00);
        Employee e3 = new Employee("Sheena",23.0,45000.00);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        Collections.sort( employees,new sortSalary() );
        System.out.println(employees);

    }
}