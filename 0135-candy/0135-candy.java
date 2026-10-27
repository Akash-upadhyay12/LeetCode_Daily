class Solution {
    public int candy(int[] nums){
        int [] arr = new int[nums.length];
        Arrays.fill(arr, 1);
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > nums[i-1]){
                arr[i] = arr[i-1] + 1;
            }
        }
        for(int i = nums.length-2; i>=0; i--){
            if(nums[i] > nums[i+1]){
                if(arr[i] <= arr[i+1]){
                    arr[i] = arr[i+ 1] + 1;
                }
            }
        }
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        return sum;
        
    }
}