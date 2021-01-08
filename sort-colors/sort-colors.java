class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0, mid = 0, high = nums.length-1;
        while(low <= high){
            if (nums[low] == 0){
                swap(nums,low++,mid++);
            }
            else if(nums[low] == 2){
                swap(nums,low,high--);
            }
            else{
                low++;
            }
        }
    }
    
    private void swap(int[] nums,int low,int high){
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}
