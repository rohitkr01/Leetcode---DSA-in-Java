class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Method -1 : Sort the array then return the  (length - k)th element 
        // Time Complexity : O(nlogn) , Space : O(1) .
        Arrays.sort(nums);
        return nums[nums.length-k]; 
        

    }
}