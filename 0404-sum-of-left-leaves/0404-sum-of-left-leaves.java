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


public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        int sum = 0;
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) // Check if left child is a leaf
                sum += root.left.val;
            else
                sum += sumOfLeftLeaves(root.left); // Recursively traverse left subtree
        }
        sum += sumOfLeftLeaves(root.right); // Recursively traverse right subtree
        return sum;
    }
}
