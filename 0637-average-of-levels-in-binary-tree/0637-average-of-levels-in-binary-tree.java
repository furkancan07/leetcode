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
    public List<Double> averageOfLevels(TreeNode root){
         Queue<TreeNode> queue=new LinkedList<>();
        List<Double> avg=new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            double sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                sum+=node.val;
                if(node.left!=null)queue.offer(node.left);
               if(node.right!=null) queue.offer(node.right);
            }
avg.add(sum/size);
        }
        return avg;
    }
    public List<Double> averageOfLevels2(TreeNode root) {
       List<List<Integer>> list=new ArrayList<>();
       int depth=0;
       dfs(root,list,depth);
       List<Double> avg=new ArrayList<>();
       for(List<Integer> arr : list){
        double sum=0;
        for(int i : arr){
            sum+=i;
            
        }
        avg.add(sum/arr.size());
       }
       return avg;
    }
    public void dfs(TreeNode root,List<List<Integer>> list,int depth){
        if(root==null) return;
        if(depth==list.size()) list.add(new ArrayList<>());
        list.get(depth).add(root.val);
        dfs(root.left,list,depth+1);
        dfs(root.right,list,depth+1);
    }
}