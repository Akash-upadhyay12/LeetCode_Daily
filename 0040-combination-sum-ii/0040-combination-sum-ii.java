class Solution {
        void check(int [] nums, int i, List<Integer> cur, List<List<Integer>> ans, int target){
            
            if(target==0){
                ans.add(new ArrayList<>(cur));
            
                return;
            }
            for(int j = i; j<nums.length; j++){
                if(j != i && nums[j] == nums[j-1]) continue;
                if(target>=0){
                cur.add(nums[j]);
                check(nums, j+1, cur, ans, target-nums[j]);
                cur.remove(cur.size()-1);
            }

            }
            


        }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        check(nums, 0, cur, ans, target);
        return ans;

        
    }
}