//Write a program to format date as example "21-March-2016"

import java.text.SimpleDateFormat;
import java.util.Date;
public class ques8 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String ans= formatter.format(date);
        System.out.println(ans);
    }
}