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
    
    //Recursive Method to find traverse over the List 
    List<Integer> inorderList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root== null) return inorderList;

        inorderTraversal(root.left);
        inorderList.add(root.val);
        inorderTraversal(root.right);

        return inorderList;
    }
    
}