class Solution {
    void check(int [] nums, int i, ArrayList<Integer> cur, HashSet<List<Integer>> set , boolean [] use){
        if(cur.size()==nums.length){
            set.add(new ArrayList<>(cur));
            return;
        }
        for(int j = 0; j<nums.length; j++){
            if(use[j] == false){
                cur.add(nums[j]);
                use[j] = true;
                check(nums, i+1, cur, set, use);
                cur.remove(cur.size()-1);
                use[j] = false;
            }
            
        }


    }    
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<Integer> cur = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>(); // for remove all the duplicates
        boolean [] use = new boolean[nums.length];
        check(nums, 0, cur, set, use);
        return new ArrayList<>(set);    
    }
}