// Using (instance) Method reference create and apply add and subtract method and using (Static) Method
// reference create and apply multiplication method for the functional interface created.

interface myint{
    int returnit(Test t ,int y);
}
class Test{
    int x=0;
    public Test(int x){
        this.x=x;
    }

    public int addNumbers(int y){
        return x+y;
    }
    public int subtractNumbers(int y){
        return x-y;
    }

}

public class ques3{
    private static void myMethod(Test t,myint inf,int y){
        int x=inf.returnit(t, y);
        System.out.println(x+"");
    }
    public static void main(String[] args){
        myMethod(new Test(4),Test::addNumbers,7);
        myMethod(new Test(4),Test::subtractNumbers,7);
    }
}