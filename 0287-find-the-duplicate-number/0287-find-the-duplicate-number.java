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
    
    // Time Complexity: O(N) , Space: O(1)
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
}