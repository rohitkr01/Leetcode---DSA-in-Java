class Solution {
     
    public static boolean canOperate(int[] lifetime, long mid, int machines) {
      long hours = 0;
      long totalHours = mid * machines;
      for (int l : lifetime) {
          if (l > mid) hours += mid;
          else hours += l;
      }
 
      if (hours >= totalHours) return true;
      return false;
   }

    public long maxRunTime(int n, int[] lifetime) {
      long low = 0;
      long high = 0;
 
      for (int i : lifetime) high += i;
 
      high = high / n;
      long result = 0;
 
      while (low <= high) {
          long mid = (low + high) / 2;
          if (canOperate(lifetime, mid, n)) {
              result = mid;
              // move right
              low = mid + 1;
          } else {
              // move left
              high = mid - 1;
          }
      }
      return result;
    }

}