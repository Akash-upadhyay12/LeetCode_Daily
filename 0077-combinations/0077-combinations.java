class Solution {
     void check(int n, int k,int i, ArrayList<Integer> cur,List<List<Integer>> ans, int[] nums){
        if(i==nums.length){
            if(cur.size()==k){
                ans.add(new ArrayList<>(cur));
            }
                return;
            }

            cur.add(nums[i]);
            check(n, k, i+1, cur, ans, nums);
            cur.remove(cur.size()-1);
            check(n, k, i+1, cur, ans, nums);

     }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int [] nums = new int[n];
        int j = 0;
        while(n>0){
            nums[j] = n;
            n--;
            j++;
        }
        System.out.println(Arrays.toString(nums));
        check(n, k,0, cur, ans, nums);
        return ans;

    }
}