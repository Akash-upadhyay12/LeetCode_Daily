class Solution {
    public int candy(int[] nums){
        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 2){
            if(nums[0] > nums[1] || nums[1] > nums[0]){
                return 3;
            }
            else{
                return 2;
            }
        }
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
                // else{
                //     arr[i] = arr[i+1] + 1;
                // }
            }
        }
        int sum = 0;
        for(int x : arr){
            sum += x;
        }
        return sum;
        
    }
}