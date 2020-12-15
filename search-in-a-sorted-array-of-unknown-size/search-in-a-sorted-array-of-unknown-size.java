/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */
​
class Solution {
    public int search(ArrayReader reader, int target) {
        
        int start = 0,end = start + 1;
        while(reader.get(end) < target){
            start = end;
            end = end * 2;
        }
        
       return helper(reader,target,start,end);
    }
    
    private int helper(ArrayReader reader, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        
        if (reader.get(mid) == target){
            return mid;
        }
        else if(reader.get(mid) > target){
            return helper(reader,target,start,mid-1);
        }
        else{
            return helper(reader,target,mid+1,end);
        }
    }
}
