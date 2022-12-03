class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Method -1 : Sort the array then return the  (length - k)th element 
        // Time Complexity : O(nlogn) , Space : O(1) .
        // Arrays.sort(nums);
        // return nums[nums.length-k]; 
        
        
        // Method - 2 : using Priority Queue
        //Time : O(nlogk)
        if(nums==null || nums.length==0){
        return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums){
            pq.add(val);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}