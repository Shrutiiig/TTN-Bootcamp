import java.util.Scanner;

public class ques9{

    public static void main(String[] args){
        Table table = null;
        Scanner input =  new Scanner(System.in);
        String str = input.next();
        if(str.equals("wooden")){
            table = new WoodenTable();


        }else if (str.equals("metal")){
            table = new MetalTable();
        }

        System.out.println(table.tableType());
        table.stressTest();
        table.fireTest();


    }
}

interface Furniture {
    public void stressTest();
    public void fireTest();
}

abstract class Chair implements Furniture {
    public abstract String chairType();

}
abstract class Table implements Furniture {
    public abstract String tableType();
}

class MetalChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println( "stresstest" );
    }

    @Override
    public void fireTest() {
        System.out.println( "firetest" );
    }

    @Override
    public String chairType() {
        String s = "Wooden chair";
        return s;
    }
}

class MetalTable extends Table {
    @Override
    public void stressTest() {

        System.out.println("Passed Stress Test");
    }

    @Override
    public void fireTest() {
        System.out.println("Passed Fire Test");
    }

    @Override
    public String tableType() {
        String s = "This is a metal Table";
        return s;
    }
}


class WoodenTable extends Table {
    @Override
    public void stressTest() {
        System.out.println("Failed Stress Test");
    }

    @Override
    public void fireTest() {
        System.out.println("Failed Fire Test");
    }

    @Override
    public String tableType() {
        String s = "This is a wooden Table";
        return s;
    }
}

class WoodenChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println( "stress test passed" );
    }
    @Override
    public void fireTest() {
        System.out.println( "firetest passed" );
    }

    @Override
    public String chairType() {
        String s = "Wooden chair";
        return s;
    }
}