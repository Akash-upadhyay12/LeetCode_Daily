class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> list =new  ArrayList<>();
        for(int i =1; i*i<=n; i++){
            list.add(i*i);
        }
     //   Collections.sort(list);
        int [] dp = new int[n+1];
        Arrays.fill(dp, n+1);
        dp[0] = 0;
        for(int i = 1; i<=n; i++){
            for(int x : list){
                if(i>=x){
                    dp[i] = Math.min(dp[i], dp[i-x] +1);
                }

            }
           

        }
        return dp[n];
        
    }
}