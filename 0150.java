class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st1 = new Stack<>();
	for(String s:tokens){  //for each循环            
		if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                //不为空
                if(st1.empty()) {
                    return 0;
                }
		int a = st1.pop();
                //弹出一个后不为空
                if(st1.empty()) {
                    return 0;
                }
		int b = st1.pop();
				
                //运算
		if(s.equals("+")){
			st1.push(a + b);
		}else if(s.equals("-")){
			st1.push(b - a);
		}else if(s.equals("*")){
			st1.push(a * b);
		}else if(s.equals("/")){
                        if(a == 0){//除数不为0
                        	return 0;
                    	}
		        st1.push(b / a);
		}
		}else{//不是运算符则入栈
			st1.push(Integer.parseInt(s));
		}
	}
	return st1.pop();       
    }
}
