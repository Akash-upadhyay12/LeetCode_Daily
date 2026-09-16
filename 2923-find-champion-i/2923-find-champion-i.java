class Solution {
    public int findChampion(int[][] mat) {
        int max = 0;
        int a = 0;
        for(int i = 0; i<mat.length; i++){
            int sum = 0;
            for(int j = 0; j<mat[0].length; j++){
                sum += mat[i][j];
            }
            if(sum > max){
                max = sum;
                a = i;;
            }
        }
        return a;
        
        
    }
}