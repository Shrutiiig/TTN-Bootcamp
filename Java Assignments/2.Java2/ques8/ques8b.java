// WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its
// first character is equal   to  its last character. For the required loop, use a
//     a)while statement
//     b)do-while statement

import java.util.Scanner;

public class ques8b{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        do{
            if( str.charAt(0) == str.charAt(str.length() - 1) ){
                System.out.print("The word is: " + str + " ");
                System.out.println("First and last character are equal!");
            }else{
                System.out.print("The word is: " + str + " ");
                System.out.println("First and last character are not equal!");
            }
            str = scn.nextLine();
        }while(!str.equals("done"));
    }
}
