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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        
        if(root == null)  return result;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                list.add(temp.val);
                
                if(temp.left != null )  q.offer(temp.left);
                if(temp.right != null)  q.offer(temp.right);
            }
            
            int max = list.get(0);
            for(int i = 1; i < list.size() ; i++){
                max = Math.max(max, list.get(i));
            }
            result.add(max);
        }
        
        return result;
    }
}