class Solution {
    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
 
        int n = Math.max(s1.length, s2.length);
 
        for (int i = 0; i < n; i++) {
            int x1, x2;
 
            if (i >= s1.length) x1 = 0;
            else x1 = Integer.parseInt(s1[i]);
 
            if (i >= s2.length) x2 = 0;
            else x2 = Integer.parseInt(s2[i]);
 
            System.out.println(x1 + " " + x2);
 
            if (x1 > x2) return 1;
            if (x2 > x1) return -1;
        }
 
        return 0;    
    }
}