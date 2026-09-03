class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] que, int x) {
        int count = 0;
        int [] temp = new int[nums.length];
        for(int i =0; i<nums.length; i++){
            if(nums[i] == x){
                temp[count] = i;
                count++;
            }
        }

        int [] ans = new int[que.length];
        for(int i = 0; i<que.length; i++){
            if(que[i]>count){
                ans[i] = -1;
            }
            else{
                ans[i] = temp[que[i] - 1];
            }
        }
        return ans;

        
    }
}