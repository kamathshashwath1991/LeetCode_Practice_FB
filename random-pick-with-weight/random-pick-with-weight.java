class Solution {
    
    int sum[];
​
    public Solution(int[] w) {
        sum = new int[w.length];
        sum[0] = w[0];
        
        for (int i = 1;i < w.length; i++){
            sum[i] = w[i] + sum[i-1];
        }
    }
    
    public int pickIndex() {
        Random rand = new Random();
        int target = 1 + rand.nextInt(sum[sum.length-1]);
        
        int left = 0, right = sum.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if (sum[mid] == target){
                return mid;
            }
            else if(sum[mid] > target){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}
​
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
