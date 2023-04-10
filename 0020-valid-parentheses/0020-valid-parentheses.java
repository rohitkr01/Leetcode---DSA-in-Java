class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1) return false;
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<s.length()){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if( st.peek()=='(' && s.charAt(i)==')' || st.peek()=='{' && s.charAt(i)=='}' || st.peek()=='[' && s.charAt(i)==']'){
                    st.pop();
            }
            else st.push(s.charAt(i));
            i++; 
        }
    
    return st.isEmpty();
    }
}