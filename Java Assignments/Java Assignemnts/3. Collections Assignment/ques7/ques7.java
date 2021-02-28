// Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(),
// isEmpty(), isFull() and an additional operation getMin() which should return a minimum element from
// the SpecialStack. (Expected complexity  O(1))

public class ques7{
    private int[] arr;
    private int tos;   // top of stack
    private int elementCount; // total elements present in stack.

    protected void intializeValues(int size){   // -> can be protected
        this.arr = new int[size];
        this.tos = -1;
        this.elementCount = 0;
    }

    public void stack(){
        intializeValues(10);
    }

    public void stack(int size){
        intializeValues(size);
    }

    public int size(){
        return this.elementCount;
    }

    public boolean isEmpty(){
        return this.elementCount == 0;
    }

    public boolean isFull(){
        return this.elementCount == this.capacity();
    }

    protected int capacity(){   // can be protected
        return this.arr.length;
    }

    public void push(int data)throws Exception{
        if(this.size() == this.capacity()){
            throw new Exception("StackIsFull");
        }

        this.arr[++this.tos] = data;
        this.elementCount++;
    }

    public int peek()throws Exception{

        if(this.isEmpty()){
            throw new Exception("StackIsEmpty");
        }

        return this.arr[this.tos];
    }

    public int pop() throws Exception{
        if(this.isEmpty()){
            throw new Exception("StackIsEmpty");
        }

        int rv = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.elementCount--;

        return rv;
    }


}