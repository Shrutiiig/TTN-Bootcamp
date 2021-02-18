// Write a method that takes a string and print the number of occurrences of each character in the string.

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ques3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if( !hm.containsKey(ch) ){
                hm.put(ch,1);
            }else{
                int val = hm.get(ch);
                hm.put(ch,val+1);
            }
        }
        for (Map.Entry<Character,Integer> entry : hm.entrySet()){
            System.out.println("Character = " + entry.getKey() + ", Count = " + entry.getValue());
        }

    }
}