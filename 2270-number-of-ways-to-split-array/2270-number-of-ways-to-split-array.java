class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long sum=0;
        for(int val : nums){ sum+=val; }
        
        long leftsum=0 ;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            leftsum += nums[i];
            
            if(leftsum >= sum-leftsum){
                cnt++;
            }
        }
        return cnt;
    }
}