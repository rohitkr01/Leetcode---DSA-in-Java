public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cntOne = 0;
        while(n != 0){
            cntOne += n & 1;
            n = n >>> 1;
        }
        return cntOne;
    }
}