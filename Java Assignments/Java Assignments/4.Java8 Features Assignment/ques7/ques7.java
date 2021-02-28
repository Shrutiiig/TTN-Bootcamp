// Override the default method of the interface.

interface A{
    public static int num = 100;
    public default void display() {
        System.out.println("display method of A");
    }
}
interface B{
    public static int num = 1000;
    public default void display() {
        System.out.println("display method of B");
    }
}
public class ques7 implements A, B{
    public void display() {
        A.super.display();
        B.super.display();
    }
    public static void main(String args[]) {
        ques7 obj = new ques7();
        obj.display();
    }
}