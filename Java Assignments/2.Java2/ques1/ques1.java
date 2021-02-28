
import java.util.Date;
import java.util.HashSet;

public class ques1 {


}
interface LibraryFunctions
{
    public void issuebook(BookItem b);
    public void returnbook();
}
class Book{
    String bookname;
    String authorname;
    private int availablebooks;
    private int issuedbooks;

}
class BookItem extends Book{

    Date issuedate;
    Date returndate;

}
class Library implements LibraryFunctions{
    static HashSet<Book> bookstock;

    public Library()
    {
        bookstock=new HashSet<Book>();
    }

    public void checkStock(){}

    @Override
    public void issuebook(BookItem b) {

    }

    @Override
    public void returnbook() {
    }

}
class Student implements LibraryFunctions{

    String name;

    @Override
    public void issuebook(BookItem b) {
    }

    @Override
    public void returnbook() {
    }


}