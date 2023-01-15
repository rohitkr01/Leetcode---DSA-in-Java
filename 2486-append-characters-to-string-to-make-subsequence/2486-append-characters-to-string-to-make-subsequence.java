class Solution {
    public int appendCharacters(String s, String t) {
        int n1 = 0 , n2 =0;
        
        while(n1 < s.length() && n2 < t.length()){
            if(s.charAt(n1) == t.charAt(n2)){
                n1++;
                n2++;
            }else{
                n1++;
            }
        }
        
        return t.length() - n2;
    }
}