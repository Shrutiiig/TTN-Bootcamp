// WAP to sort the Student objects based on Score, if the score are the same then sort on First Name

import java.util.*;

class Student{
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        super();
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public int getId() {
        return id;
    }
    public String getname() {
        return name;
    }
    public double getScore() {
        return score;
    }
}

public class ques5 {

    public static void main(String[] args){
        Student s1 = new Student(1,"Ankur",75.00);
        Student s2 = new Student(2,"Priya",95.00);
        Student s3 = new Student(3,"Vishal",80.00);
        Student s4 = new Student(4,"Khushal",95.00);
        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s2.getScore()>s1.getScore()){
                    return 1;
                }else if(s2.getScore()<s1.getScore()){
                    return -1;
                }
                return s1.getname().compareTo(s2.getname());
            }
        });

        for(Student st: students){
            System.out.println(st.getname());
        }
    }
}