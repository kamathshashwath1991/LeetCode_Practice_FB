class Solution {
    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        //we need to form aux array but to form we need to know the size.
        //we will check max value from nums and form array with that max value
        int max = 0;
        for (int num: nums){
            max = Math.max(max, num);
        }
​
        int aux[] = new int[max+1];
​
        //create array with elements of num as index so that we can check their occurences
        for (int num : nums){
            aux[num] += num;
        }
​
        //formed the array now apply house robber logic
        int skip = 0, take  = aux[0];
        for (int i = 1; i < aux.length; i++){
            int temp = skip;
            skip = Math.max(skip,take);
            take = temp + aux[i];
        }
​
        return Math.max(skip,take);
    }
}
