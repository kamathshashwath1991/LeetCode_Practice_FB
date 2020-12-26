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
        
        int left = 0, right = left +1;
        
        while(reader.get(right) < target){
            left = right;
            right *= 2;
        }
        
        while(left <= right){
            int mid = left + (right - left)/2;
            if (reader.get(mid) == target){
                return mid;
            }
            else if(reader.get(mid) > target){
                right = mid - 1;
            }
            else{
                left = mid +1;
            }
        }
        
        return -1;
    }
}
