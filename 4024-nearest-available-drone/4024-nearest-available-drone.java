class Solution {
    public int nearestDrone(int[][] mat, int[] target) {
        int min = Integer.MAX_VALUE;
        int find = -1;
        for(int i = 0; i<mat.length; i++){
            int x = mat[i][0];
            int y = mat[i][1];
            int z = mat[i][2];

            int ans = Math.abs(x - target[0]) + Math.abs(y - target[1]);
            

            if(ans <= z){
                if(ans < min){
                    min = ans;
                    find = i;
                }
            }

        }
        return find;

        
    }
}