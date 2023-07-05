class Solution {
    
    //Method - 1
//     public int[] countBits(int n) {
//         int[] ans = new int[n+1];
//         ans[0]=0;
//         for(int i =1; i <= n ; i++){
//             ans[i] = cntOneBit(i);
//         }
//         return ans;
//     }
    
//     public int cntOneBit(int n){
//         int cntOne = 0;
//         while( n!= 0){
//             cntOne += n & 1;
//             n = n >>> 1;
//         }
//         return cntOne;
//     }
    
    // Method -2
    // An easy recurrence for this problem is f[i] = f[i / 2] + i % 2.
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i=1; i<=n; i++) 
            ans[i] = ans[i >> 1] + (i & 1);
        
        return ans;
    }
}