//  WAP to sorting string without using string Methods?

// reduce complexity...

public class ques2{
	public static void main(String[] args) {
      String str = "helloabrctdpfmzj";
      char temp = 0;
      char[] chars = str.toCharArray();
      for(int i=0; i < chars.length; i++) {
         for(int j=i+1; j < chars.length; j++) {
            if(chars[j] > chars[i]) {
               temp = chars[i];
               chars[i] = chars[j];
               chars[j] = temp;
            }
         }
      }
      System.out.println("After Sorting:");
      for(int k=0; k < chars.length; k++) {
         System.out.print( chars[k] + " " );
      }
   }
}
