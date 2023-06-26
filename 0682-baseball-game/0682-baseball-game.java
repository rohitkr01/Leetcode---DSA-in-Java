class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int removed = 0;
        for(String str : operations){
            if(str.equals("+")){
                if(st.size()>=2){
                    int first = st.pop();
                    int second = st.peek();
                    st.push(first);
                    st.push(first + second);
                }
            }
            else if(str.equals("C")){
                st.pop();              
            }
            else if(str.equals("D")){
                st.push(st.peek() * 2);
            }
            else{
                st.push(Integer.parseInt(str));
            }
        }
        
        int sum =0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        
        return sum;
    }
}