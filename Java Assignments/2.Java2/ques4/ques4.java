// double check locking/singleton - read
// read all 3 different ways
// https://javarevisited.blogspot.com/2014/05/double-checked-locking-on-singleton-in-java.html#axzz6naOpDdr0

class ques4 {
    public static void main(String[] args){
        Singleton x = Singleton.Singleton();
        Singleton y = Singleton.Singleton();
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("\n");

        y.s = (y.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
    }
}

class Singleton {

    private static Singleton single_instance = null;
    public String s;
    private Singleton(){
        s = "Hello I am a string part of Singleton class";
    }

    public static Singleton Singleton(){
        if (single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
