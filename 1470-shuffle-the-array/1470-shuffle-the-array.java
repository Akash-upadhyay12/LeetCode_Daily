class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] arr = new int[nums.length];
        int mid = nums.length/2;
        int p1 = 0;
        int p2 = 1;

        for(int i =0; i<mid; i++){
            arr[p1] = nums[i];
            p1+=2;
        }
        for(int i =mid; i<nums.length; i++){
            arr[p2] = nums[i];
            p2+=2;
        }
        return  arr;
        
    }
}