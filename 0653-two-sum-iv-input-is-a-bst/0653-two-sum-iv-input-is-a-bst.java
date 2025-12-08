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
    // set daha yavaş olduğu için map yaotım 
    public boolean findTarget(TreeNode root, int k) {
        
        Map<Integer,Integer> map=new HashMap<>();
    
        return dfs(root,map,k);    
    }
    public boolean dfs(TreeNode root,Map<Integer,Integer> map,int k){
        if(root==null) return false;
        if(map.containsKey(k-root.val)) return true;
        else map.put(root.val,0);
        return  dfs(root.left,map,k) || dfs(root.right,map,k);
       
        
    }
}