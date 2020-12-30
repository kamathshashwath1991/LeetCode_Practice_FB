class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0, rSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
               rSum += 1; 
            }
            else{
                rSum -= 1;
            }
            if (map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }
            else{
                map.put(rSum,i);
            }
            
        }
        
        return max;
    }
}
