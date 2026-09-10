class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<lst.length; i++){
            int ans = lst[i] + ld[i];
            for(int j = 0; j<wst.length; j++){
                int ans1 = Math.max(ans, wst[j]);
                int finish = ans1 + wd[j];
                min = Math.min(min, finish);
            }
        }
        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i<wst.length; i++){
            int ans = wst[i] + wd[i];
            for(int j = 0; j<lst.length; j++){
                int ans1 = Math.max(ans, lst[j]);
                int finish = ans1 + ld[j];
                min2 = Math.min(min2, finish);
            }
        }
        return Math.min(min, min2);
        
    }
}