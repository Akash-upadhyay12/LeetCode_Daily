class Solution {
    public long gcdSum(int[] nums) {
        int max = 0;
        int [] maxnum = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            maxnum[i] = max;
        }
        int[] pg = new int[nums.length];
        for(int j = 0; j<nums.length; j++){
            int a = nums[j];
            int b = maxnum[j];
            while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
            }
            pg[j] = a;
        }
        Arrays.sort(pg);
        int i = 0;
        int j = pg.length-1;
        long ans = 0;
        while(i<j){
            int a = pg[i];
            int  b= pg[j];
            while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
            }
            ans +=(long)a;
            i++;
            j--;
            
        }
        return ans;
        
    }
}