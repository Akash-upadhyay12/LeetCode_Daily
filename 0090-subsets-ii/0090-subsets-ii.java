class Solution {
    void check(int [] nums, int i,ArrayList<Integer> cur,HashSet<List<Integer>> set){
        if(i>=nums.length){
            set.add(new ArrayList<>(cur));
            return;
        }
        //Same as subset 1 but the approach is quite different.
        //Take the element 
        cur.add(nums[i]);
        check(nums, i+1, cur , set);
        // remove the last element
        cur.remove(cur.size()-1);
        // skip or not take condition
        check(nums, i+1, cur, set);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //first we try the brute force approach
        Arrays.sort(nums); // For maintaining order of element
        ArrayList<Integer> cur = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>(); // for remove all the duplicates
        check(nums, 0, cur, set);
        return new ArrayList<>(set);
        
    }
}