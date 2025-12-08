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
 // Mantık inorder bst de sıralamalı veri bizde o şekilde çözdük 
class Solution {
    int count=0;
    int result=0;
    public int kthSmallest(TreeNode root, int k) {
      if(k==0) return 0;
      dfs(root,k);
      return result;
        
    }
    public void dfs(TreeNode root,int k){
       if(root==null) return;
        dfs(root.left,k);
        count++;
        if(count==k){
            result=root.val;
            return;
        }
        dfs(root.right,k);


    }
}