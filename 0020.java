class Solution {
    public boolean isValid(String s) {
        Stack st = new Stack();
		char[] c = s.toCharArray();
		for(char cc:c){
			if(cc == '{' || cc == '[' || cc == '('){
				st.push(cc);
			}else{
				if(st.empty()) return false;
				char ccc = (char)st.pop();
				if(ccc == '{'){
					if(cc != '}') return false;
				} else if(ccc == '['){
					if(cc != ']') return false;
				} else if(ccc == '('){
					if(cc != ')') return false;
				} 
			}
		}
        if(st.empty()){
                return true;
        }
        else {
                return false;
        }
        
    }
}
