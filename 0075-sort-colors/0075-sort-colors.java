class Solution {
    //Simple used Bubble sort 
    // Time Complexity : O(n^2)
//     public void sortColors(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=0;j<nums.length-i-1;j++){
//                 if(nums[j]>nums[j+1]){
//                     int temp = nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=temp;
//                 }
//             }
//         }
//     }
    
    // Time Complexity : O(n^2)
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low =0;
        int start = 0, end = n-1;
        while(start <= end){
            
            if(nums[start]== 0){
                swap(nums,  start, low);
                low++;
                start++;
            }
            else if(nums[start]==2){
               swap(nums, start, end);
               end--;
            }
            else 
                start++;
        }        
    }
    
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}