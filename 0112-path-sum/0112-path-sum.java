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
        if(root==null) return false;
        return dfs(root,targetSum,0);
           
    }
    public boolean dfs(TreeNode root,int target,int count){
        if(root==null) return false;
        count+=root.val;
        if(root.left==null && root.right==null) return count==target;
        return dfs(root.left,target,count) || dfs(root.right,target,count);

    }
}