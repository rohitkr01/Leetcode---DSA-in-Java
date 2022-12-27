class Solution {
    
     public void mergeSort(int[] arr, int left, int right) {
        if (left == right) return;
 
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
 
        merge(arr, left, mid, right);
    }
    public void merge(int[] arr, int left, int mid, int right) {
        int p1 = left;
        int p2 = mid + 1;
        int x = 0;
 
        int[] sorted = new int[right - left + 1];
 
        while (p1 <= mid && p2 <= right) {
            if (compare(arr[p1], arr[p2]) > 0) {
                sorted[x] = arr[p2];
                x++;
                p2++;
            } else {
                sorted[x] = arr[p1];
                x++;
                p1++;
            }
         }
        while (p1 <= mid) {
            sorted[x] = arr[p1];
            x++;
            p1++;
        }
        while (p2 <= right) {
            sorted[x] = arr[p2];
            x++;
            p2++;
        }
 
        x = 0;
        for (int i = left; i <= right; i++) {
            arr[i] = sorted[x];
            x++;
        }
    }

    public int compare(int x, int y) {
        if (Integer.bitCount(x) == Integer.bitCount(y)) return x - y;
        return Integer.bitCount(x) - Integer.bitCount(y);
    }
 
    public int[] sortByBits(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }
}