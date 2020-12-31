class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int rSum = 0;
        map.put(0,1);
        int count =0;
        for (int i =0; i< nums.length; i++){
             rSum += nums[i];
            int complement = rSum-k;
            if (map.containsKey(complement)){
                count+= map.get(complement);
            }
           if(map.containsKey(rSum)){
               map.put(rSum,map.get(rSum)+1);
           }
            else{
                map.put(rSum,1);
            }
        }
        return count;
    }
}
