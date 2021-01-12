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
    int sum;
    public int sumNumbers(TreeNode root) {
        sum = 0;
        StringBuilder sb = new StringBuilder();
        helper(root,sb);
        return sum;
    }
    
    private void helper(TreeNode root, StringBuilder sb){
        if (root == null) return;
        
        sb.append(root.val);
        int length= sb.length();
        if (root.left == null && root.right == null)
            sum += Integer.valueOf(sb.toString());
        
        helper(root.left,sb);
        sb.setLength(length);
        helper(root.right,sb);
    }
}
