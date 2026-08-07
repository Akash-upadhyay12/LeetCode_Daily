class Solution {
    void check(int [] nums, int i, ArrayList<Integer> cur,  List<List<Integer>> ans, boolean [] use){
        if(cur.size()==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int j = 0; j<nums.length; j++){
            if(use[j] == false){
                cur.add(nums[j]);
                use[j] = true;
                check(nums, j+1, cur, ans, use);
                cur.remove(cur.size()-1);
                use[j] = false;
            }
            
        }


    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean [] use = new boolean[nums.length];
        check(nums, 0, cur, ans, use);
        return ans;
        
    }
}