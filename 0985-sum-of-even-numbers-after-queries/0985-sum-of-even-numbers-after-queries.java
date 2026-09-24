class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] qu){
        int [] arr = new int[qu.length];
        int i = 0;
        for(int [] q : qu){
            int val = q[0];
            int idx =q[1];
            nums[idx] += val;
            int sum = 0;
            for(int x : nums){
                if(x % 2 == 0){
                    sum += x;
                }
            }
            arr[i] = sum;
            i++;
        }
        return arr;
        
    }
}