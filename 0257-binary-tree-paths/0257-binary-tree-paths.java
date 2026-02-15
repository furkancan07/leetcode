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

 // Direk String ile yapsak backtrackinge gerek kalmayacak çünkü String imuttable değişmez yani
 // ama biz list kullandık referan değişeceği için onu backtracking ile eski haline getirmek gerek 
class Solution {
   
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dfs(root,result,sb);
        return result;
        
    }
  
    public void dfs(TreeNode node,List<String> result,StringBuilder sb){
        if(node==null){   
            return;
        }
        int len=sb.length();
        if(node.left!=null || node.right!=null) sb.append(node.val+"->");
        
       else if(node!=null && node.left==null && node.right==null){
              sb.append(node.val);
              result.add(sb.toString());
        }
        
        dfs(node.left,result,sb);
        dfs(node.right,result,sb);
        sb.setLength(len);
        
        
    }
}