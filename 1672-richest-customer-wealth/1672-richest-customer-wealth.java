class Solution {
    public int maximumWealth(int[][] mat) {
        int max = 0;
        for(int i = 0; i<mat.length; i++){
            int sum = 0;
            for(int j = 0; j<mat[0].length; j++){
                sum += mat[i][j];
                 max = Math.max(max, sum);

            }
        }
        return max;
        
    }
}