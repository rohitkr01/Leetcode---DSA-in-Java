class Solution {
    //Method -1 : Brute force approach
    // Time Complexity: O(n) , but used division operator
//     public int[] productExceptSelf(int[] nums) {
//         // int[] ans = new int[nums.length];
        
//         int prod = 1;
//         for(int val : nums){
//             prod *= val;
//         }
        
//         int[] ans = new int[nums.length];
//         for(int i =0; i< nums.length;i++){
//             ans[i] = prod/nums[i];
//         }
        
//         return ans;
//     }
    
    //Method -2 : Time compplexity : O(n)
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
        int[] ans = new int[n];
        int prod = 1;
        for(int i =0;i<n;i++){
            prod *=nums[i];
            ans[i]=prod;
        }
        int suff =1;
        for(int i = n-1;i>=1;i--){
            ans[i]=ans[i-1]*suff;
            suff*=nums[i];
        }
        ans[0]=suff;
        
        return ans;
    }
}