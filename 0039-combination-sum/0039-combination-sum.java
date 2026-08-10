class Solution {
    void check(int [] nums,int i,  List<Integer> cur, List<List<Integer>> ans, int target){
        if(i==nums.length){
        if(target==0){
            ans.add(new ArrayList<>(cur));
        }
            return;
        }
        
        if(target>=0){
            cur.add(nums[i]);
            check(nums, i, cur, ans, target-nums[i]);
            cur.remove(cur.size()-1);
            check(nums, i+1, cur, ans, target);
        }
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        check(nums, 0, cur, ans, target);
        return ans;
        
    }
}