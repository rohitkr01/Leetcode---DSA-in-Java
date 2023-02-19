/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)  return ans;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        boolean isLeftToRight = true;
        while(!q.isEmpty()){
            
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                
                if(isLeftToRight){
                    list.add(temp.val);
                }else{
                    list.add(0,temp.val);
                }
                
                if(temp.left != null)  q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            
            ans.add(list);
            isLeftToRight = !isLeftToRight;
        }
        return ans;
    }
}