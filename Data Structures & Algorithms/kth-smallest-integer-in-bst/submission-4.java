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
    private int count;
    private int result;
    public int kthSmallest(TreeNode root, int k) {
        inorderTrav(root,k);
        return result;

    }
    private void inorderTrav(TreeNode root , int k){
        if(root == null)
        {
            return;
        }
         
        inorderTrav(root.left , k);
        count++;
         if(count == k)
         {
            result = root.val;
            return;

         }
        inorderTrav(root.right , k);
        
    }
}
