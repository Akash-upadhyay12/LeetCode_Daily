class Solution {
    void check(int [] nums, int i, ArrayList<Integer> cur, List<List<Integer>> ans){
        if(i>=nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        //This is  for take
        cur.add(nums[i]);
        check(nums, i+1, cur, ans);
        // This is  for not remove last elment after adding
        cur.remove(cur.size()-1);

        // This is for Not Take
        check(nums, i+1, cur,ans);


    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        check(nums, 0, cur, ans);
        return ans;
        
    }
}