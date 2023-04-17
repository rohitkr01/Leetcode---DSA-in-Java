class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> ans = new ArrayList<>();
        int largeCandy = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largeCandy = Math.max(largeCandy, candies[i]);
        }
        
        for(int i=0;i<n;i++){
            if(candies[i]+ extraCandies >= largeCandy){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}