class Solution {
    public int[] answerQueries(int[] nums, int[] q) {
        Arrays.sort(nums);
        int [] arr = new int[q.length];
        for(int i = 0; i<q.length; i++){
            int sum = 0;
            int count = 0;
            for(int j = 0; j<nums.length; j++){
                sum += nums[j];
                if(sum<=q[i]){
                    count++;
                }
            }
            arr[i]= count;
        }
        return arr;
        
    }
}