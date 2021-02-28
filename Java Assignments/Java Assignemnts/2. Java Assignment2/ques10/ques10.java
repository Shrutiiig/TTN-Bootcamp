//package java2;

import java.util.LinkedList;
import java.util.Queue;

public class ques10 {

}

class Order{
    int tokenNo;
    double  amount;

}
class Customer
{
    String name;

    public void placeorder(){}
    public void makePayment(){}
}

class Cashier
{
    Customer c;
    Order o;
    public void generateBill(){ }
    public void checkPayment(){}


}

class Barista{

    static  Queue<Order> orderList;
    static Queue<Order> completedOrderList;

    public Barista()
    {
        orderList=new LinkedList<Order>();
        completedOrderList=new LinkedList<Order>();
    }

    public void processingOrder() {}
    public void notifyReadyOrders(){}

}