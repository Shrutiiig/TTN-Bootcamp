import java.util.Stack;

public class ques7min_stack {
    Stack<Long> st = new Stack<>();
    long globalMin = 0;

    public void push(int x) {
        long val = x;
        if(st.size()==0){
            st.push(val);
            globalMin = val;
            return;
        }

        if(val < globalMin){
            st.push((val - globalMin) + val);
            globalMin = val;
        }else{
            st.push(val);
        }
    }

    public void pop() {
        if(st.peek() < globalMin){
            globalMin = (globalMin - st.peek()) + globalMin;
        }

        st.pop();

    }

    public int top() {
        if(st.peek() < globalMin) return (int)globalMin;

        return (int)((long)st.peek());
    }

    public int getMin() {
        return (int)globalMin;
    }
}