// Create an Employee Class with instance variables (String) name, (Integer)age, (String)city and get
// the instance of the Class using constructor reference.


interface EmployeeDetails{
    public abstract Employee getEmployee(String name, Integer age, String city);
}

class Employee{
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }
}

public class ques4 {
    public static void main(String[] args) {
        EmployeeDetails empDetails = Employee::new;
        System.out.println(empDetails.getEmployee("Arsh",21,"Ladakh"));
    }
}