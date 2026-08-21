class Solution {
    void check(int [] nums, int i, ArrayList<Integer> cur, List<List<Integer>> ans){
        ans.add(new ArrayList<>(cur));
        for(int j = i; j<nums.length; j++){
            if(j != i && nums[j] == nums[j-1]) continue;
            cur.add(nums[j]);
            check(nums, j+1, cur, ans);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        check(nums, 0, cur, ans);
        return ans;

        
    }
}