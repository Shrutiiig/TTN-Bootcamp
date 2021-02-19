// Sum all the numbers greater than 5 in the integer list.

import java.util.*;
public class ques10 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(6);
        int ans = list.stream().filter(i -> i > 5).mapToInt(i -> i).sum();
        System.out.println(ans);
    }
}