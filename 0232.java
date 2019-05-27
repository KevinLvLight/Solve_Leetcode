class MyQueue {

    /** Initialize your data structure here. */
    private Stack<Integer> st;
    private Stack<Integer> spareSt;
    private int front;
    private int len;
    public MyQueue() {
        this.st = new Stack<>();
        this.spareSt = new Stack<>();
        this.front = 0;
        this.len = 0;
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(st.isEmpty()){
            st.push(x);
            front = x;
        }else{
            st.push(x);
        }
        len += 1;
        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(st.isEmpty()) return 0;
        for(int i = 1; i <= len; i++){
            spareSt.push(st.pop());
        }
        if(spareSt.isEmpty()) return 0;
        int temp = spareSt.pop();
        len--;
        if(spareSt.isEmpty()){
            return temp;
              
        }else{
            
        front = spareSt.peek();
        for(int i = 1; i <=len; i++){
            st.push(spareSt.pop());
        }
        
        return temp;
        }
        
    }
    
    /** Get the front element. */
    public int peek() {
        return front;
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(len == 0)
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
