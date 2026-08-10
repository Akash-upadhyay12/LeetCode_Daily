class Solution {
    void check(int [] nums,List<Integer> cur, List<List<Integer>> ans, boolean[] arr){
            if(cur.size() == nums.length){
                ans.add(new ArrayList<>(cur));
                return;
            }
            for(int j = 0; j<nums.length; j++){
                if(arr[j]== false){
                    cur.add(nums[j]);
                    arr[j] = true;
                    check(nums, cur, ans, arr);
                    cur.remove(cur.size()-1);
                    arr[j] = false;
                }
            }          

    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean [] arr = new boolean[nums.length];
        check(nums,cur, ans, arr);
        return  ans;
        
        
    }
}