class Solution {
    public int minimumAverageDifference(int[] nums){
        long sum = 0;
        for(int x : nums){
            sum += x;
        }

        long min = Long.MAX_VALUE;
        long cursum = 0;
        int idx = 0;

        for(int i = 0; i<nums.length; i++){
            cursum += nums[i];
            long y = 0;
            long a = cursum / (i + 1);
            long b = Math.abs(sum - cursum);

            if(i == nums.length - 1){
                y = 0;
            }
            else{
                b /= (nums.length-i-1);
                y = b;
            }

            long diff = Math.abs(a-y);

            if(diff < min){
                min = diff;
                idx = i;
            }
        }
        //System.out.println(Arrays.toString(arr) + sum);
        return idx;
    }
}