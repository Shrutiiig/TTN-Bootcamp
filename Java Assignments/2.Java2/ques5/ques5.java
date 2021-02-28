// WAP to show object cloning in java using cloneable and copy constructor both.

class Student implements Cloneable{
    int rollno;
    String name;

    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
//copy constructor method
class Employee{
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    Employee(Employee e){
        System.out.println("Copy Constructor called");
        id = e.id;
        name = e.name;
    }
}
public class ques5 {
    public static void main(String[] args) throws Exception{
        Student s1 = new Student(1 , "Shruti Gupta");
        Student s2 = (Student)s1.clone();

        System.out.println("for s1: "+ s1.rollno + " => " + s1.name);
        System.out.println("for s2: "+ s2.rollno + " => " + s2.name);

        Employee e1 = new Employee(10, "Shruti");
        Employee e2 = new Employee(e1);

        System.out.println("for e1: "+ e1.id + " => " + e1.name);
        System.out.println("for e2: "+ e2.id + " => " + e2.name);
    }
}