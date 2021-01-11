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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return helper(preorder,inorder,0,inorder.length-1,0);
    }
    
    private TreeNode helper(int[] preorder, int[] inorder, int start, int end, int index){
        
        if (start > end){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[index]);
        //logic to create boundaries
        int rootIndex = start;
        while(inorder[rootIndex]!= preorder[index]){
            rootIndex++;
        }
        root.left = helper(preorder,inorder,start,rootIndex-1,index+1);
        root.right = helper(preorder,inorder,rootIndex+1,end,rootIndex+1-start+ index);
        return root;
    }
}
