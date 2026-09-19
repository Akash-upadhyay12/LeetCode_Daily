class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int val = 0;
        int max = 0;
        for(int i = 0; i<mat.length; i++){
            int count = 0;
            for(int j = 0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    count++;
                    if(count>max){
                        max = Math.max(max, count);
                        val = i;
                    }
                }
            }
        }
        
        int [] arr = new int[2];
        arr[0] = val;
        arr[1] = max;
        return arr;
    }
}