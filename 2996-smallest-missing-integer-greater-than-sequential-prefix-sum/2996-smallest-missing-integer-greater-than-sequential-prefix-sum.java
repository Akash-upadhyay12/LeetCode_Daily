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
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i = 0; i<nums.length; i++){
           map.put(nums[i] , i);
         }
         int i = sum;
         for(int x : map.values()){
            if(!map.containsKey(i)){
                return i;
            }
            i++;
         }
         return i;

        
    }
}