class Solution {
    void check(int [] nums,int i, List<Integer> cur, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        check(nums, i+1,cur, ans);
        cur.remove(cur.size()-1);
        check(nums, i+1, cur, ans);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        check(nums, 0, cur, ans);
        return ans;

        
    }
}