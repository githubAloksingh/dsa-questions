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
    public List<Double> averageOfLevels(TreeNode root) {
        
        ArrayList<Double> ans = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        if(root==null) return ans;
        
        
        que.offer(root);
       
        while(!que.isEmpty()){
             double sub=0;
            int n = que.size();
            for(int i=0;i<n;i++){
                TreeNode curr=que.poll();
                sub+=curr.val;
              
            if(curr.left!=null){
                que.offer(curr.left);
            }
            if(curr.right!=null){
                que.offer(curr.right);
            }
            }
            double average=sub/n;
            ans.add(average);
        }
        return ans;
        
    }
}





    