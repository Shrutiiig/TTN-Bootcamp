// Collect all the even numbers from an integer list.

import java.util.*;
public class ques9 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(6);
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
    }
}