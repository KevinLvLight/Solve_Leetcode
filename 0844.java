class Solution {
    
    private Stack<Character> Sst = new Stack<>();
    private Stack<Character> Tst = new Stack<>();
    
    public boolean backspaceCompare(String S, String T) {
        Sst = pushAndPop(S);
        Tst = pushAndPop(T);
        
        if(Sst.isEmpty() && Tst.isEmpty()) return true;
        
        while(!Sst.isEmpty() && !Tst.isEmpty()){
            char m,n;
            m = Sst.pop();
            n = Tst.pop();
            if(m != n) 
                return false;
                
        };
        
        if(!Sst.isEmpty() || !Tst.isEmpty()){
            return false;
        }
        
        return true;
        
    }
    
    public boolean isValid(String s){
        int len = s.length();
        if(len < 0 || len > 200) return true;
        for(char c: s.toCharArray()){
            if((c >= 'a' && c <= 'z')||(c == '#')){;}
            else 
                return true;
        }
        return false;
    }
    
    public Stack<Character> pushAndPop(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(st.isEmpty()){
                if(c != '#')
                    st.push(c);
            }else{
                if(c == '#'){
                    
                    st.pop();
                }else{
                    st.push(c);
                }
            }
        }
        return st;
    }
}
