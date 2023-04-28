class Solution {
    //Time: O(n) , Space: O(n)
    /*public int findDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        return -1;
    } */
    
   /* // Time Complexity: O(N) , Space: O(1)
    public int findDuplicate(int[] nums) {
        
        int n = nums.length;
        System.out.println(n);
        for(int i=0;i< n;i++){
            int index = nums[i]% (n+1);
            nums[index]+=(n+1);
        }
        for(int i=0;i< n;i++){
            if(nums[i]/(n+1) >=2) return i;
        }
        return -1;
    }
    */
    
    // Not modifying array
    //Time:O(n) , space: O(1)
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        
        do{
          slow = nums[slow];         // slow pointer move 1 step
          fast = nums[nums[fast]];  // fast pointer moves 2 step 
        }while(slow !=fast);
        
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}