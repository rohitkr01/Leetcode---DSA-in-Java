class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row , preRow = null ;
        
        for(int i=0;i< numRows ;++i){
            row = new ArrayList<>();
            for(int j =0;j<=i;++j){
                if(j==0 || j== i)
                    row.add(1);
                else
                    row.add(preRow.get(j-1) + preRow.get(j));
            }
            
            preRow = row;
            res.add(row);
        }
        return res;
    }
}