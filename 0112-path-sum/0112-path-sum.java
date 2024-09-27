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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return getPath(root, targetSum, 0);
    }

    private boolean getPath(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }

        sum += root.val;

        // Check if we are at a leaf node and the sum equals targetSum
        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }

        // Recursively check the left and right subtree
        return getPath(root.left, targetSum, sum) || getPath(root.right, targetSum, sum);
    }
}









// public class Solution {
//     public boolean hasPathSum(TreeNode root, int sum) {
//         if(root == null) return false;
    
//         if(root.left == null && root.right == null && sum - root.val == 0) return true;
    
//         return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//     }







