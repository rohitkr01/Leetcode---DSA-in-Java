class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0 , right = 0;
        Set<Character> str = new HashSet();
        int max = 0;
        
        while(right < s.length()){
            char c = s.charAt(right);  
            if(str.add(c)){
                max = Math.max(max,right-left+1);
                right++;
            }
            else{
                while(s.charAt(left)!=c){
                    str.remove(s.charAt(left));
                    left++;
                }
                str.remove(c);
                left++;
            }
        }
        
       return max;
    }
}