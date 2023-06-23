class Solution {
    public int splitArray(int[] nums, int k) {
        int max =0;
        int sum =0;
        for(int val : nums){
            sum+=val;
            max = Math.max(max,val);
        }
        
        int lo = max;
        int hi = sum;
        int ans=0;
        
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(nums, mid, k)==true){
                ans=mid;
                hi = mid-1;
                
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    
    public boolean isPossible(int[] nums, int mid, int k){
        int sum =0;
        int sa=1;
        
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            
            if(sum > mid){
                sa +=1;
                sum = nums[i];
            }
            
        }
        return  sa <= k;
    }
    
}