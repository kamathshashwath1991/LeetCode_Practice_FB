class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        helper(candidates, list, target, new ArrayList<>(), 0);
        return list;
    }
    
    private void helper(int[] candidates,List<List<Integer>> list, int target, List<Integer> curr, int index){
        
        if (target < 0){
            return;
        }
        if (target == 0){
            list.add(new ArrayList<>(curr));
            return;
        }
        
        for (int i = index; i< candidates.length; i++){
            curr.add(candidates[i]);
            helper(candidates,list,target- candidates[i],curr, i);
            curr.remove(curr.size()-1);
        }
    }
}
