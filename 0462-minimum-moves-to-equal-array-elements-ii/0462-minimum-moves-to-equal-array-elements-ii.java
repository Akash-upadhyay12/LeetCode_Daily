class Solution {
    public int minMoves2(int[] nums){
        if(nums.length == 1){
            return 0;
        }
        if(nums.length == 2){
            return Math.abs(nums[0] - nums[1]);
        }
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        // int idx = 0;
        // for(int i =1 ; i<nums.length; i++){
        //     if(Math.abs(nums[i]-nums[i-1]) < diff){
        //         diff = Math.abs(nums[i]-nums[i-1]);
        //         idx = i;
        //     }
        // }
        //System.out.println(idx);
        // int a = nums[idx];
        // int sum = 0;
        // for(int x : nums){
        //     sum += Math.abs(nums[idx] - x);
        // }
        int sum = 0;
        int a = nums.length/2;
        int fans =  nums[a];
        for(int x : nums){
            sum += Math.abs(fans - x);
        }

        return sum;
        
    }
}