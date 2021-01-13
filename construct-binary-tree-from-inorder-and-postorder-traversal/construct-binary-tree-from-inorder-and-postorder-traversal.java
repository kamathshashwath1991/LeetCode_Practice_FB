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
    HashMap<Integer,Integer> map;
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder){
            if(postorder.length == 0){
                return null;
            }
        int n = postorder.length;
        this.map = new HashMap<>();
        this.index = n-1;
            //add all elements of inorder to hashmap
        for(int i =0 ;i < inorder.length; i++){
            map.put(inorder[i] , i);
        }
       return helper(inorder,postorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] inorder,int[]postorder,int start,int end){
        //base
        if(start > end){
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[index--]);
        int rootIndex = map.get(root.val);
        root.right = helper(inorder,postorder, rootIndex+1, end);
        root.left = helper(inorder,postorder, start , rootIndex - 1);
        
        return root;
    }
}
