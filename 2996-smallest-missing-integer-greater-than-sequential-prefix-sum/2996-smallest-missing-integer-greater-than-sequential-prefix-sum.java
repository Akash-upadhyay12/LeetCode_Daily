class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length == 1){
            return nums[0] +1;
        }
         int sum = nums[0];
         for(int i = 1; i<nums.length; i++){
            if(nums[i] - nums[i-1] == 1){
                sum += nums[i];
            }
            else{
                break;
            }
         }
         HashSet<Integer> set = new HashSet<>();
         for(int x : nums){
           set.add(x);
         }
         int i = sum;
         for(int x : set){
            if(!set.contains(i)){
                return i;
            }
            i++;
         }
         return i;

        
    }
}