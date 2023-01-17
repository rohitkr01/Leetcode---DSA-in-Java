class Solution {
    public int orangesRotting(int[][] nums) {
          //- Initial Fresh Oranges
        int countFresh=0;
        //- If nothing is there
        if (nums==null||nums.length==0){
            return 0;
        }
        int row= nums.length;
        int col=nums[0].length;
        Queue<int[]> q=new LinkedList<>();
        //- Now we will put all the rotten oranges in que
        //- And Count No. of  Fresh Oranges
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                if (nums[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if (nums[i][j]!=0){
                    countFresh++;
                }
            }
        }
        // - Since there are already no fresh oranges at minute 0, the answer is just 0.
        if (countFresh==0){
            return 0;
        }
        //- It count the minutes
        int countMin=0;
        //- It Count the total no values in que that have been rotted
        int cnt=0;
        //- For Movement (L,R,D,U)
        int []dx={0,0,1,-1};
        int []dy={1,-1,0,0};


        // -BFS starting from initially rotten oranges
        while (!q.isEmpty()){
            int size=q.size();
            cnt+=size;
            for (int i = 0; i < size; i++) {
                int [] point=q.poll();
                for (int j = 0; j <4 ; j++) {
                    int x=point[0]+dx[j];
                    int y=point[1]+dy[j];

                    if (x<0 || y<0 || x>=row || y>=col || nums[x][y]==0 || nums[x][y]==2){
                        continue;
                    }
                    // -Updating the values since they also Became Rotten
                    nums[x][y]=2;
                    q.offer(new int[]{x,y});
                }
            }
            if (q.size()!=0){
                countMin++;
            }
        }
        return countFresh == cnt ? countMin : -1;
    }
}