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
    public int widthOfBinaryTree(TreeNode root) {
        int maxi=0;
        Queue<Pair<TreeNode,Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root,0));
        
        while(!queue.isEmpty()){
            int n=queue.size();
           int left=0;
            int right=0;
            int minIndex=queue.peek().getValue();
            
           
            for(int i=0;i<n;i++){
                Pair<TreeNode, Integer> current = queue.poll();
                TreeNode node = current.getKey();
                int idx = current.getValue()-minIndex;
                if(i==0) left=idx;
                if(i==n-1) right=idx;
                if(node.left!=null){
                    queue.offer(new Pair<>(node.left,idx*2+1));
                    
                }
                
                if(node.right!=null){
                    queue.offer(new Pair<>(node.right,idx*2+2));
                
            }
            }
             maxi=Math.max(maxi,right-left+1);
                
            
        }
            return maxi;
    }}

class Pair<K, V>{
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key=key;
        this.value=value;
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}



