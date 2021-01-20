/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res;
    int count;
    public int kthSmallest(TreeNode root, int k) {
        res = 0;
        count = k;
        helper(root,k);
        return res;
    }
​
    private void helper(TreeNode root, int k){
        if (root == null) return;
        
        helper(root.left,k);
        count--;
        if (count == 0) res = root.val;
        helper(root.right,k);
        
    }
}
