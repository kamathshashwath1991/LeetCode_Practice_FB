class Node{
    int x;
    int min;
    Node prev;
    
    public Node(int x, int min, Node prev){
        this.x = x;
        this.min = min;
        this.prev = prev;
    }
}
​
class MinStack {
​
    Node tail;
    /** initialize your data structure here. */
    public MinStack() {
        tail = null;
    }
    
    public void push(int x) {
        if (tail == null){
            tail = new Node(x,x,tail);
        }
        else{
            tail = new Node(x,Math.min(x,tail.min),tail);
        }
    }
    
    public void pop() {
        tail = tail.prev;
    }
    
    public int top() {
        return tail.x;
    }
    
    public int getMin() {
        return tail.min;
    }
}
​
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
