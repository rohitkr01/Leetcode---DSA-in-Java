class Solution {
    public int missingNumber(int[] nums) {
        int n = 0; 
        for(int val : nums){
           n = n ^ val;
        }
        
        for(int i =1;i<= nums.length;i++){
            n = n ^ i;
        }
        
        return n;
    }
}