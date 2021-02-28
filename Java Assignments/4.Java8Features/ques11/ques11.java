// Find the average of the number inside the integer list after doubling it.

import java.util.*;
public class ques11 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(6);
        Double ans = list.stream().mapToDouble(a -> a * 2 ).average().orElse(0.0);
        System.out.println(ans);
    }
}