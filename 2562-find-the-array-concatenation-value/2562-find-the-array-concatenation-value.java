class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]);
            if(i<j){
            sb.append(nums[j]);
            }
            sum += Integer.parseInt(sb.toString());
            i++;
            j--;

        }
        return sum;
        
    }
}