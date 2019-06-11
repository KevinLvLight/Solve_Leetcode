class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String op :  ops){
            
            if(op.equals("C")){
                if(st.isEmpty()) return 0;
                st.pop();
            }else if(op.equals("D")){
                if(st.isEmpty()) return 0;
                int m = st.peek();
                int n = m * 2;
                st.push(n);
            }else if(op.equals("+")){
                if(st.isEmpty()) return 0;
                int a = st.pop();
                int b = st.peek() + a;
                st.push(a);
                st.push(b);
                
            }else{
                st.push(Integer.valueOf(op));
            }
        }
        
        if(st.isEmpty()) return 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        
        return sum;
        
    }
}