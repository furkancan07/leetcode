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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        if(depth(root)==-1) return false;
        return isBalanced(root.right) || isBalanced(root.left);

    }
    public int depth(TreeNode root){
        if(root==null) return 0;
        int right=depth(root.right);
        if(right==-1) return -1;
        int left=depth(root.left);
        if(left==-1) return -1;
        if(Math.abs(right-left)>1) return -1;
        return 1 + Math.max(right,left);
    }
}