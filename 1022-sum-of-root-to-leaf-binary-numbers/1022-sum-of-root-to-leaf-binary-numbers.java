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
    
    // Time Complexity :- O(N) ,where N is a number of nodes, since one has to visit each node.
    
    //Space Complexity :- BigO(H) where H is height of tree, 
    //Considering recursion stack it in O(H), if we dont consider it. Then O(1)
     public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }
    public int sumRootToLeaf(TreeNode root, int sum){
        if(root == null) return 0;
        sum = (2 * sum) + root.val;
        if(root.left == null && root.right == null) return sum;
        return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
    }
}