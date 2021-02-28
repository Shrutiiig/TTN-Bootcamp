// Find the first even number in the integer list which is greater than 3.

import java.util.*;
public class ques12 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(6);
        int ans = list.stream().filter(i -> i % 2 == 0)
                .filter(i -> list.get(i) > 3)
                .findFirst().get();
        System.out.println(ans);
    }
}