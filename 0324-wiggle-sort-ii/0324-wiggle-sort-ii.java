class Solution {
    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int [] arr = new int[nums.length];
        int l = (nums.length-1)/2;
        int r = nums.length-1;
        for(int i = 0; i<nums.length; i+=2){
            arr[i] = nums[l];
            l--;
            if(i+1<nums.length){
            arr[i+1] = nums[r];
            r--;
            }
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = arr[i];
        }
    }
}