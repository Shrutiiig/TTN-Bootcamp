public class ques6 {

    public static void main(String args[]) {

        int[] a = new int[5];
        try {
            System.out.println("Access element five :" + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            a[0] = 8;
            System.out.println("Fifth element value: " + a[4]);
            System.out.println("The finally statement is executed");
        }
    }
}