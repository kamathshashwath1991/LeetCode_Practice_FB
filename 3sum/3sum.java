class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> list = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return list;
        }
        
        Arrays.sort(nums);
        //[-4,-1,-1,0,1,2]
        
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int j = i + 1;
            int k = nums.length-1;
            while(j < k){
                int sum = nums[j] + nums[k];
                if (sum == -nums[i]){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum > -nums[i]){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
