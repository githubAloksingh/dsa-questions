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
    private int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        calculatePathSum(root);
        return maxSum;
        
    }
    private int calculatePathSum(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftSum=Math.max(calculatePathSum(root.left),0);
        int rightSum=Math.max(calculatePathSum(root.right),0);
        int currentPathSum = root.val+leftSum+rightSum;
        maxSum=Math.max(maxSum,currentPathSum);
        return root.val+Math.max(leftSum, rightSum);
        
        
    }
}