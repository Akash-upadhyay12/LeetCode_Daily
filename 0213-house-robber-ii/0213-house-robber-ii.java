class Solution {
    public int rob(int[] arr) {
        if(arr.length ==1){
            return arr[arr.length-1];
        }
        if(arr.length == 2){
            return Math.max(arr[arr.length-1], arr[arr.length-2]);
        }
        int [] dp1 = new int[arr.length];
        dp1[0] = arr[0];
        dp1[1] = Math.max(dp1[0], arr[1]);
        for(int i = 2; i<arr.length-1; i++){
            int ans = arr[i] + dp1[i-2];
            int ans2 = dp1[i-1];
            dp1[i] = Math.max(ans, ans2);
        }
        int [] dp2 = new int[arr.length];
        dp2[0] = 0;
        dp2[1] = arr[1];
        dp2[2] = Math.max(dp2[1], arr[2]);
        for(int i = 3; i<arr.length; i++){
            int ans = arr[i] + dp2[i-2];
            int ans2 = dp2[i-1];
            dp2[i] = Math.max(ans, ans2);
        }
        return Math.max(dp1[dp1.length-2], dp2[dp2.length-1]);
        

        
    }
}