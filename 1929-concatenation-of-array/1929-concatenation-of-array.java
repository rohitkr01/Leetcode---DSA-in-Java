class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] ans = new int[2*n];
        for(int j=0;j<n;j++){
            ans[j]=nums[j];
        }
         
        for(int i=n; i<2*n ; i++){
            ans[i]=nums[i-n];
        }
        return ans;
    }
}