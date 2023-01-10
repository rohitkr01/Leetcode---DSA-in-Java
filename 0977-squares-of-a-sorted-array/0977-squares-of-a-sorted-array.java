class Solution {
    /*
    // Brute , Time : O(nlogn)
    public int[] sortedSquares(int[] nums) {
         for(int i=0;i<nums.length;i++){
             nums[i] = (int)Math.pow(nums[i],2);
         }
        Arrays.sort(nums);
        
        return nums;
    }
    */
    
    // Time complexity : O(n) , Space : O(n)
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
                                        
        int i = 0,j = n -1;
        
        for(int c = n-1 ; c>=0 ; c--){
            if(Math.abs(nums[i])< Math.abs(nums[j])){
                res[c] = nums[j] * nums[j] ;
                j--;
            }else{
                res[c] = nums[i] * nums[i] ;
                i++;
            }
        }
       return res; 
    }
    
}