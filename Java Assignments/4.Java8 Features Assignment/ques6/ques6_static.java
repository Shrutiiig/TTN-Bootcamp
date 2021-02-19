//Create and access default and static methods of an interface.

interface helper{
    default void first(){
        System.out.println("this is default method");
    }
    static void third(String str){
        System.out.println(str);
    }
}
public class ques6_static implements helper{
    public void sayMore(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        ques6_static demo = new ques6_static();
        demo.first();   //

        helper.third("Third message is printing");
    }
}