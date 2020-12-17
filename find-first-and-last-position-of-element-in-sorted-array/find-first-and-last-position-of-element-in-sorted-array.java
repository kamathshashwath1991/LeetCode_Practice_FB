class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = binarySearchFirst(nums,target);
        if (first == -1){
            return new int[]{-1,-1};
        }
        int last = binarySearchLast(nums,target);
        return new int[]{first,last};
    }
    
    private int binarySearchFirst(int[] nums,int target){
        int left = 0, right = nums.length-1;
        int index =-1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] >= target){
                if (nums[mid] == target){
                    index = mid;
                }
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        
        return index;
    }
    
    private int binarySearchLast(int[] nums,int target){
        int left = 0, right = nums.length-1;
        int index = -1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if (nums[mid] <= target){
                if (nums[mid] == target){
                    index = mid;
                }
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        
        return index;
    }
}
