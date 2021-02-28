public class ques3a {
    public static void main(String[] args) {
        try{
            Class.forName("RandomClass");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}