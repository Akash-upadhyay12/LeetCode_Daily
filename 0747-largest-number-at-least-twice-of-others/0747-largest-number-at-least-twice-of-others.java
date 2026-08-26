class Solution {
    public int dominantIndex(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;
        int x = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > largest){
            second = largest;
            largest = nums[i];
            x = i;
        }
        else if(nums[i] > second && nums[i] != largest){
            second = nums[i];
        }
    }
    if(second != 0){
        if(largest / second >= 2){
            return x;
        }
    }
    else if(second == 0 && largest != 0){
        return x;
    }
    else if(largest == 0 && second == 0){
        return -1;
    }
    return -1;
    }
}