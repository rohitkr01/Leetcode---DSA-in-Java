class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n-k+1];
		int t =0;  // store index
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i=0; i< n;i++){
			// remove numbers out of range k
			if(!dq.isEmpty() && dq.peek() == i-k){
				dq.poll();
			}

			// Remove smaller number in k range as they are useless
			while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
				dq.pollLast();
			}

			dq.offer(i);
			if(i>=k-1){
				ans[t++]=arr[dq.peek()];
			}
		}
		return ans;
    }
}