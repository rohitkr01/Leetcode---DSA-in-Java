class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public void reverse(int num[],int low , int high){
        while(low<high){
            int temp = num[low];
            num[low] = num[high];
            num[high] = temp;
            low++;
            high--;
        }
    }
}