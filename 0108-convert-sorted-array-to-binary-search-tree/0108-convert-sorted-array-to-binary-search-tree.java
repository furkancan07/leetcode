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
    public TreeNode sortedArrayToBST(int[] nums) {
      if(nums.length==0) return null; 
     
      return sortedListToBST(nums,0,nums.length-1);   
    }
    
    private TreeNode sortedListToBST(int[] nums, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = sortedListToBST(nums, start, mid - 1);
        node.right = sortedListToBST(nums, mid + 1, end);

        return node;
    }
    /*
    class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        inorder(root1, list);
        inorder(root2, list);

        // Değerleri sırala
        Collections.sort(list);

        // Sorted list → Balanced BST
        return sortedListToBST(list, 0, list.size() - 1);
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    private TreeNode sortedListToBST(List<Integer> list, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = sortedListToBST(list, start, mid - 1);
        node.right = sortedListToBST(list, mid + 1, end);

        return node;
    }
}

    
     */

    
}