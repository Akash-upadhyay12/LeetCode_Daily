class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int max = 0;
        while(j<nums.length){
            if(nums[j] == 1){ 
                j++;
            }
            else if(k > 0){ 
                k--;
                j++;
            }
          else{
            k--;
            j++;
            while(k<0){
                if(nums[i] == 1){
                    i++;
                }
                else{
                    i++;
                    k++;
                }
            }

          }
          max = Math.max(max, j - i + 1);


        }
        return max-1;

        
    }
}