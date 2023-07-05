class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0]=0;
        for(int i =1; i <= n ; i++){
            ans[i] = cntOneBit(i);
        }
        return ans;
    }
    
    public int cntOneBit(int n){
        int cntOne = 0;
        while( n!= 0){
            cntOne += n & 1;
            n = n >>> 1;
        }
        return cntOne;
    }
}