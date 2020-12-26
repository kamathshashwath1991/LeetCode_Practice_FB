class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || nums == null) return new int[]{-1,-1};
        int first = binarySearchFirst(nums,target);
        System.out.println(first);
        if (first < 0) return new int[]{-1,-1};
        int second = binarySearchSecond(nums,target);
        return new int[]{first,second};
    }
    
    private int binarySearchSecond(int[] nums,int target){
        int index = -1, left = 0, right = nums.length-1;
        while(left <= right){
            int mid = left+ (right - left)/2;
            if (nums[mid] <= target){
                if (nums[mid] == target){
                    index = mid;
                }
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
    
    return index;
    }
    
    
    
    private int binarySearchFirst(int[] nums,int target){
        
        int index = -1, left = 0, right = nums.length-1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] >= target){
                if (nums[mid] == target){
                    index = mid;
                }
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return index;
    }
}
