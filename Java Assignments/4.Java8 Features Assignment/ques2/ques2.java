// Create a functional interface whose method takes 2 integers and return one integer.

import java.util.function.BiFunction;
public class ques2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum = " + add.apply(2, 3));
    }
}