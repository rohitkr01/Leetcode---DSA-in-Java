class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        
        
        String first = strs[0], last = strs[strs.length-1];
        String ans="";
        // System.out.println(first+"_____"+last);
        for(int i=0; i < Math.min(first.length(),last.length()) ; i++){
            if(first.charAt(i) == last.charAt(i)){
                ans += first.charAt(i);
            }
            else  return ans;
        }
        return ans;
    }
}