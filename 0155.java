class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> st;
    Stack<Integer> min;
	
	public MinStack() {
		this.st = new Stack<>();
		this.min = new Stack<>();
	}
	
	public void push(int x) {
		if(st.isEmpty()) {
			st.push(x);
			min.push(x); 
		}else {
            st.push(x);
            if(min.isEmpty()) return ;
			int temp = min.peek();
			if(x <= temp) {
				min.push(x);
			}
		}
	}
	
	public void pop() {
		if(st.isEmpty()) return;
		int temp = st.pop();
        if(min.isEmpty()) return ;
		int temp2 = min.peek();
		if(temp == temp2)
        {  min.pop();}
    }
	
	public int top() {
        if(st.isEmpty()) {return 0;}
		else {return st.peek();}
	}
	
	public int getMin() {
        if(min.isEmpty()){ return 0;}
		else {return min.peek();}
	}   
    
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */