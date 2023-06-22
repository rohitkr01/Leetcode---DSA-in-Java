class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum =0;
        for(int val : nums){
            sum+=val;
        }
        
        // System.out.println(sum);
        
        int n = nums.length;
        long leftsum =0;
        long minAvg = Integer.MAX_VALUE;
        int ansindx = 0;
        for(int i =0;i<n;i++){
            leftsum += nums[i];
            long rightsum = sum-leftsum;
            long rightAvg;
            if(i == (n-1))
                rightAvg = rightsum;
            else 
                rightAvg = rightsum/(n-i-1);
            long avgDiff = Math.abs( (leftsum/(i+1))- rightAvg);
            // System.out.println(leftsum+" "+rightsum +" "+avgDiff);
            
            if(avgDiff < minAvg){
                minAvg = avgDiff;
                ansindx = i;
            }
            // minAvg = Math.min(minAvg, avgDiff);
            
        }
                                   
       return ansindx;
    }
}