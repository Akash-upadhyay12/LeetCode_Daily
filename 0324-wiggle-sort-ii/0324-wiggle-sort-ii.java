class Solution {
    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int [] arr = new int[nums.length];
        int i =0;
        int j = nums.length-1;
        int k = 0;
        while(i<j){
            arr[k] = nums[i];
            if(k+1 < arr.length){
            arr[k+1] = nums[j];
            }
            i++;
            j--;
            k+=2;
            
        }
       
        for(int p = 0; p<nums.length; p++){
            nums[p] = arr[p];
        }
    }
}