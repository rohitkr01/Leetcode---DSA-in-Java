class Solution {
    public int maxDistance(int[] colors) {
        
        // Steps to solve this question
        // 1. Take a while loop and run till left <= right , check if the rigth color is same as left the decrease right by 1.
        // 2. else take ans is max(ans, left-right) ans increase left by 1.
        // 3. finally return ans;
        int ans =0;
        int left =0, right = colors.length -1;
        while(left <= right ){
            if(colors[left]==colors[right]){
                right--;
            }
            else{
                ans = Math.max(ans, right -left);
                left++;
                right = colors.length -1;
            }
        }
        return ans;
    }
}