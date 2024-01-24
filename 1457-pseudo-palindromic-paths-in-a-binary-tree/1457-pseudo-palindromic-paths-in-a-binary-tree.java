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
    public int pseudoPalindromicPaths(TreeNode root) {
        return countPseudoPalindromicPaths(root, 0);
    }
    
    private int countPseudoPalindromicPaths(TreeNode node, int path) {
        if (node == null) {
            return 0;
        }
        
        // Update the current path information
        path ^= (1 << node.val);
        
        // If it's a leaf node, check if the current path is pseudo-palindromic
        if (node.left == null && node.right == null) {
            // Check if only one or zero bits are set in the path (palindromic permutation)
            return (Integer.bitCount(path) <= 1) ? 1 : 0;
        }
        
        // Recursive calls for left and right subtrees
        int leftCount = countPseudoPalindromicPaths(node.left, path);
        int rightCount = countPseudoPalindromicPaths(node.right, path);
        
        // Return the sum of pseudo-palindromic paths from left and right subtrees
        return leftCount + rightCount;
    }
}
