/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    /*
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a=Math.min(p.val,q.val);
        int b=Math.max(p.val,q.val);
        return result(root,a,b);
    }
    public TreeNode result(TreeNode root, int p, int q){
        if(root==null) return null;
        if(root.val>=p && root.val<=q){return root;}
        TreeNode left=result(root.left,p,q);
        TreeNode right=result(root.right,p,q);
        return left!=null ? left : right!=null ? right : null;
    }
}
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    while(root!=null){
      if(p.val<root.val && q.val<root.val){
        root=root.left;
      }else if(p.val>root.val && q.val>root.val){
        root=root.right;
      }else{
        return root;
      }
        }
        return null;
    }
}