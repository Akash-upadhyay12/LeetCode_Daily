class Solution {
    public int minimumAverageDifference(int[] nums){

        long [] arr = new long[nums.length];
        long sum = nums[0];
        arr[0] = sum;
        int a = 1;
        for(int i = 1; i<nums.length; i++){
            sum += nums[i];
            arr[a] = sum;
            a++;
        }
        long min = Long.MAX_VALUE;
        int idx = 0;
        for(int i = 0; i<arr.length; i++){
            long x = arr[i]/(i+1);
            long y = 0;

            if(i == arr.length-1){
                y = 0;
            }
            else{
                y = (sum - arr[i])/(arr.length-i-1);
            }
            long diff = Math.abs(x-y);
            if(diff < min){
                min = diff;
                idx = i;
            }
        }
        System.out.println(Arrays.toString(arr) + sum);
        return idx;
    }
}