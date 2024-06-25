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
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }
    int totalSum=0;
    private void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.right);
        totalSum+=root.val;
        root.val=totalSum;
        traverse(root.left);
        
    }
}






