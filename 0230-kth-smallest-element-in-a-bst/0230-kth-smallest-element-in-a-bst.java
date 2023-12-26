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
    HashSet<Integer> al = new HashSet<>();
    public int kthSmallest(TreeNode root, int k) {
        preorder(root);
        Integer[] array = al.toArray(new Integer[0]);
        return array[k - 1];
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        al.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
