class Solution {
    void check(int [] nums, int i,int target,ArrayList<Integer> cur,List<List<Integer>> ans){
    if(i>=nums.length){
        if(target == 0){
            ans.add(new ArrayList<>(cur));
            
        }
        return;
    }
    cur.add(nums[i]);
    if(nums[i]<=target){
    check(nums, i, target-nums[i], cur, ans);
    }
    cur.remove(cur.size()-1);
    check(nums, i+1, target, cur,ans);

}   
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        check(nums, 0, target, cur, ans);
        return ans;
        
    }
}