class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length;
        int result[] = new int[m*n];
        int idx = 0;//matrix index
        
        int dir = 1;
        int i = 0, j = 0;
        
        while(idx < result.length){
            result[idx] = matrix[i][j];
            if (dir == 1){
                
                 if (j == n-1){
                    i++; dir = -1;
                }
                else if (i == 0){
                    j++; dir = -1;
                }
                else{
                    i--; j++;
                }
