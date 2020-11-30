class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }
        
        int longest = 0;
        
        for (int num : set){
            if (!set.contains(num - 1)){
                int currNum = num;
                int currentLength = 1;
                
                while(set.contains(currNum + 1)){
                    currentLength++;
                    currNum++;
                }
                
                longest = Math.max(longest,currentLength);
            }
        }
        
        return longest;
    }
}
