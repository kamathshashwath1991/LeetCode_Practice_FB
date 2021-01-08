class Solution {
    public void sortColors(int[] nums) {
      int left = 0;int mid = 0, high = nums.length-1;
        while(left <= high)
        {
            if (nums[left] == 0){
                swap(nums,mid++,left++);
            }
            else if(nums[left] == 2){
                swap(nums,high--,left);
            }
            else{
                left++;
            }
        }        
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
