class Solution {
    void check(int [] nums, int i, ArrayList<Integer> cur,Set<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        check(nums,i+1, cur, ans);
        cur.remove(cur.size()-1);
        check(nums, i+1, cur, ans);

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> cur = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();
        check(nums, 0,cur, ans);
        return new ArrayList<>(ans);
        
    }
}