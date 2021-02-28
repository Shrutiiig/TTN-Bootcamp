//Create and access default and static methods of an interface.

interface helper{
    default void first(){
        System.out.println("this is default method");
    }
}
public class ques6_default implements helper{
    public void sayMore(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        ques6_default demo = new ques6_default();
        demo.first();

    }
}