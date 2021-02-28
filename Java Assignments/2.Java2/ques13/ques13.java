// Create a custom exception that does not have any stack trace.

public class ques13 {

    public static void main(String[] args) {

        try
        {

            throw new MyException("I am custom exception");

        }
        catch(MyException e)
        {
            e.printStackTrace();
        }
    }

}

class MyException extends Throwable
{


    public MyException(String message)
    {
        super(message ,null,false,false);
    }

}