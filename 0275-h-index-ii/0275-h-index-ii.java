class Solution {
    public int hIndex(int[] citations) {
        
        // apply binary search and check whether the mid lement is greater than or equal to arr length - mid ,if it is then candIndx = n - mid and end = mid -1 , else start = mid =1;
        int n = citations.length;
        int start =0, end = n-1;
        int candIndx =0;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(citations[mid] >= n-mid){
                candIndx = n-mid;
                end = mid-1;
            }
            else start = mid+1;
        }
        return candIndx;
    }
}