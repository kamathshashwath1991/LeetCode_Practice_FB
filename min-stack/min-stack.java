class MinStack {
    Stack<Integer> st;
    Stack<Integer> min_st;
    int min;
​
    /** initialize your data structure here. */
    public MinStack() {
        st = new Stack<>();
        min_st = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        st.push(x);
       if (min_st.isEmpty() || x <= min_st.peek()) {
            min_st.push(x);
       }
    }
    
    public void pop() {
        if (st.peek().equals(min_st.peek())){
                min_st.pop();
        }
            st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min_st.peek();
    }
}
​
