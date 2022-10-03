// problem link -> https://leetcode.com/problems/matrix-diagonal-sum/


class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum =0;
        for(int i= 0; i<n; i++) {
            sum = sum + mat[i][i] + mat[i][n - i - 1];
        }
        if(mat.length %2 == 0) {
            return sum ;
        } else {
            return sum - mat[n/2][n/2];
        }
    }
}