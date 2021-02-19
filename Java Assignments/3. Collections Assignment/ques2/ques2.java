//Write a method that takes a string and returns the number of unique characters in the string.

import java.util.Scanner;
import java.util.HashSet;
public class ques2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashSet<Character> hm = new HashSet<>();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if( !hm.contains(ch) ){
                System.out.println(ch);
                count++;
                hm.add(ch);
            }
        }
        System.out.println(count);
    }
}