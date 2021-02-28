//  Implement multiple inheritance with default method inside the interface.

interface A{
    default void a(){
        System.out.println("a is printing");
    }
}

interface B{
    default void b(){
        System.out.println("b is printing");
    }
}

public class ques8 implements A, B {

    public static void main(String[] args) {
        ques8 demo = new ques8();
        demo.a();
        demo.b();
    }
}