class Solution {
    public int maximumUnits(int[][] mat, int n) {
        Arrays.sort(mat, (a, b) -> b[1]-a[1]);
        int rem = n;
        int sum = 0;
        for(int i = 0; i<mat.length; i++){
                if(mat[i][0]<=rem){
                    sum += mat[i][0]*mat[i][1];
                    rem -= mat[i][0];
                }
                else{
                    sum += rem * mat[i][1];
                    break;
                }
        }
        return sum;
        
    }
}