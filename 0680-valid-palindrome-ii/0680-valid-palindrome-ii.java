class Solution {
    public boolean validPalindrome(String s) {
        // int[] freq = new int[26];
        // for(int i=0;i<s.length;i++){
        //     char ch = s.charAt(i);
        //     freq[ch-'a'] +=1;
        // }
        
        int start =0, end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){   
                // check for the left subpart
                if( isSubPalindrome(s, start+1,end) ) return true;
                
                // check for the right subpart
                return isSubPalindrome(s, start, end-1);
            }
            start++;
            end--;
        }
        return true;
    }
    
    public boolean isSubPalindrome(String str,int s , int e ){
        while(s<=e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        
     return true;
    }
}