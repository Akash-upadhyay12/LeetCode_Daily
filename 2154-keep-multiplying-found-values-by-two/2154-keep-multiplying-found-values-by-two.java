class Solution {
    public int findFinalValue(int[] nums, int x) {
       int i = 0;
       while(i<nums.length){
        if(nums[i] == x){
            x *=2;
            i = 0;
        }
        else{
            i++;
        }

       }
       return x;

        
        
    }
}