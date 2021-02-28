// WAP to convert seconds into days, hours, minutes and seconds.

import java.util.Scanner;

public class ques7{
    public static void ConvertSectoDay(int n){

        int day = n / (24 * 3600);
        n = n % (24 * 3600);
        int hour = n / 3600;
        n %= 3600;
        int minutes = n / 60 ;
        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ConvertSectoDay(n);
    }
}