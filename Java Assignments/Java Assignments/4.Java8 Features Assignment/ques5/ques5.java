// Implement following functional interfaces from java.util.function using lambdas:
//(1) Consumer
//(2) Supplier
//(3) Predicate
//(4) Function

import java.util.*;
import java.util.function.*;
public class ques5 {
    public static void main(String[] args) {

        //consumers
        List<String> names = Arrays.asList("Tarun", "Keerti", "Shruti","Aarya", "Aastha");
        names.forEach(name -> System.out.println("Hello, " + name));

        //predicate
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10));

        //function
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", s -> s.length());
        System.out.println(value);

        //supplier
        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());
    }
}