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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res,root,sum,new ArrayList<Integer>());
        return res;
    }
    
    private void helper(List<List<Integer>> res, TreeNode root,int sum, ArrayList<Integer> curr){
        if (root == null) return;
        curr.add(root.val);
        if (root.val == sum && root.left == null && root.right == null){
            res.add(new ArrayList<>(curr));
        }
        else{
            helper(res,root.left,sum - root.val,curr);
            helper(res,root.right,sum - root.val,curr);
        }
        curr.remove(curr.size()-1);
    }
}
