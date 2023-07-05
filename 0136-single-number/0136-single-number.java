class Solution {
    
    // Brute force approach
    //1. Count the element by storing into a map
    // 2.Travese over the map and return the key whose value count is 1.
    
     // Optimized approach , Time: O(n)
    public int singleNumber(int[] nums) {
        int single = nums[0];
        for(int i = 1 ;i < nums.length;i++){
            single = single ^ nums[i];
        }
        
        return single;
    }
}