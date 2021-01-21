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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        helper(root,0);
        Collections.reverse(list);
        return list;
    }
    
    private void helper(TreeNode root, int level){
        if (root == null) return;
        
        if (level == list.size()){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        
        helper(root.left,level+1);
        helper(root.right,level+1);
    }
}
