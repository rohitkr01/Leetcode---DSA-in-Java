class Solution {
    
    // Method - 1 , Time complexity : O(n) , Space complexity: O(1)
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
   
    /*
    // Method - 2 :  Time: O(n) ,Space : O(n)
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k = k%n;
        int[] result = new int[n];
        int j = n-k;
        for(int i = 0 ;i < k; i++){
            result[i] = nums[j];
            j++;
        }
        j=0;
        for(int i= k ; i<n;i++){
           result[i] = nums[j]; 
            j++;
        }
       for(int i=0;i<n;i++){
           nums[i]=result[i];
       } 
    }
    */
    /*
    // Method - 3 : 
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = n- k;i<n;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<n-k;i++){
            list.add(nums[i]);
        }
        for(int i =0;i< list.size();i++){
            nums[i]=list.get(i);
        }
    }
    */
}