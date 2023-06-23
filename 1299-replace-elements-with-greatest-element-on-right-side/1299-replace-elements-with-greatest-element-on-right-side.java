class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans =new int[arr.length];
        int max =-1;
        ans[arr.length -1]= -1;
        
        for(int i= arr.length-1;i>0;i--){
            if(arr[i]> max){
                max = arr[i];
            }
            ans[i-1]=max;
        }
        return ans;
    }
}