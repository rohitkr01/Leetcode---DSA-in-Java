class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                return x[0] - y[0];
            }
        });
 
        List<int[]> res = new ArrayList<>();
 
        int currStart = intervals[0][0];
        int currEnd = intervals[0][1];
        for (int[] interval : intervals) {
            if (interval[0] <= currEnd) // overlap
                currEnd = Math.max(currEnd, interval[1]);
            else {
                res.add(new int[] { currStart, currEnd });
                currStart = interval[0];
                currEnd = interval[1];
            }
        }  
        res.add(new int[] { currStart, currEnd });
 
        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

     return ans;
    }
}