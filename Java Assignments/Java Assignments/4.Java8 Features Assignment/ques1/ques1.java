// Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not
// Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value
// Parameter (int) Return int
//(3) Concatenation of 2 string
// Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .
// Parameter (String) Return (String)


import java.util.Arrays;
import java.util.List;
public class ques1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,1,3,4,2);
        List<String> list = Arrays.asList("Aastha","Bhumi","Chirag","Devanshi");

        //1.First number is greater than second number or not


        //2.Increment the number by 1
        nums.stream().map(a -> a+1).forEach(a -> System.out.println(a + " ") );

        //3. concat of 2 strings
        String ans = list.stream()
                .map(s -> s.substring(0, 1))
                .collect(Collectors.joining());
        System.out.println(ans);

        //4. toUpperCase
        list.stream().map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
    }
}