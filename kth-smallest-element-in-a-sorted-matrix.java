class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int m = matrix.length,n = matrix[0].length;
        int low = matrix[0][0], high = matrix[m-1][n-1];
        
        while(low <= high){
            int mid = low + (high - low)/2;
            int count = find(matrix,mid);
            if (count < k){
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
        
        return low;
    }
    
    private int find(int[][] matrix, int mid){
        int count = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j< matrix[0].length;j++){
                if (matrix[i][j] <= mid){
                    count++;
                }
            }
        }
        
        return count;
    }
}
