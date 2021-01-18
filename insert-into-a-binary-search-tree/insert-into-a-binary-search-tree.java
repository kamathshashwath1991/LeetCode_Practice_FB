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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) return node;
        
        TreeNode curr = root;
        TreeNode parent = null;
        
        while(curr!=null){
            parent = curr;
            if (curr.val <= val){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        
        if (parent.val <= val){
            parent.right = node;
        }
        else{
            parent.left = node;
        }
        return root;
    }
