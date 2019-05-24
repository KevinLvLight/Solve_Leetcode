class Solution {
  //取自一个评论，侵删
  HashMap<Character, Character> paranthesesMap = new HashMap<>();
      
  public Solution(){
    this.paranthesesMap.put('(', ')');
    this.paranthesesMap.put('[', ']');
    this.paranthesesMap.put('{', '}');  
  }
  
  public boolean isValid(String s) {
    Stack<Character> myStack = new Stack<Character>();
    for(char c: s.toCharArray()) {
      if (paranthesesMap.keySet().contains(c)) myStack.push(paranthesesMap.get(c));
      else if (myStack.isEmpty() || c != myStack.pop()) return false;  
    }  
    return myStack.isEmpty();     
  }
}