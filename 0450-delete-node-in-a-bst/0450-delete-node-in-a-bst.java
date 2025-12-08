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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        // key nerede 
        if(key<root.val) root.left=deleteNode(root.left,key);
        else if(key>root.val) root.right=deleteNode(root.right,key);
        // keyi bulduk 
        else{
            // tek çocuğu varsa veya yaprak düğüm ise
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            // 2 çocuğu varsa sağdaki en küçüğü bul
            root.val=minValue(root.right);
            root.right=deleteNode(root.right,root.val); 

              
        }
         return root;
    
        
    }
        public int minValue(TreeNode node){
            if(node.left==null) return node.val;
            return minValue(node.left);
            
        }
}