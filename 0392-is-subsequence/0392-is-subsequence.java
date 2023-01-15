class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1 =0 , n2 =0;
        
        while(n1 < s.length() && n2 < t.length()){
            if(s.charAt(n1) == t.charAt(n2)){
                n1++;
                n2++;
            }else{
                n2++;
            }
        }
        
        if(n1 == s.length())  return true;
        
        return false;
    }
}