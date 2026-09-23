class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1000000007;
        for(int[] q : queries){
            int l = q[0];
            int r = q[1];
            int k = q[2];
            int v = q[3];
            for(int i = l; i<=r; i+=k){
                nums[i] = (int)((1L * nums[i] * v) % mod);
            }
        }
        int xor  = 0;
        for(int x : nums){
            xor ^= x;
        }
        return xor;
        
    }
}