class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length() , n2 = needle.length();
        for(int i =0 ; i<= n1-n2 ;i++){
            int j =i ;
            int k =0;
            int cnt = 0;
            int ans = i;
            while(haystack.charAt(j) == needle.charAt(k)){
                cnt++;
                j++;
                k++;
                // System.out.println(cnt + " ");
                if(cnt== n2)  return ans;
            } 
        }
        return -1;
    }
}