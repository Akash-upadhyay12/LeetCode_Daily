class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int k = j +1;
                int l = nums.length-1;

                while(k<l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;
                    }
                    else if(sum > target){
                        l--;

                    }
                    else{
                        k++;
                    }
                }
            }
        }
        return new ArrayList<>(ans);
        
    }
}