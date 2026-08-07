class Solution {
    void check(int [] nums,int i, int target,  ArrayList<Integer> cur, List<List<Integer>> ans, int sum){
        if(i==nums.length){
        if(sum == target){
            ans.add(new ArrayList<>(cur));;
        }
        return;
        }

        cur.add(nums[i]);
        if(sum<=target){
        check(nums, i,  target, cur ,ans, sum + nums[i]);
        }
        cur.remove(cur.size()-1);
        check(nums, i+1, target, cur, ans, sum);


    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        ArrayList<Integer>  cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int sum =0;
        check(nums,0, target, cur, ans, sum);
        return ans;
        
    }
}