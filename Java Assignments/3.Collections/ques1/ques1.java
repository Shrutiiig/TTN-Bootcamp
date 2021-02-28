// Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
// find the sum of the numbers in List.

import java.util.*;

public class ques1 {
    public static void main(String args []){
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(25);
        list.add(10);
        list.add(45);
        list.add(36);

        ListIterator<Integer> iterator = list.listIterator();
        int sum=0;
        int i=0;
        while(iterator.hasNext()){
            sum += list.get(i++);
            iterator.next();
        }
        System.out.println(sum);
        System.out.println(list);

    }
}