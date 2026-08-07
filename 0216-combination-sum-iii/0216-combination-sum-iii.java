class Solution {
    void check(int k, int n,ArrayList<Integer> cur,List<List<Integer>> ans, int i, int sum){
        if(cur.size()==k && sum == n){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int j = i; j<=9; j++){
            cur.add(j);
            if(sum < n){
            check(k,n, cur, ans, j+1, sum+j);
            }
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        int sum = 0;
        check(k, n, cur, ans, 1, sum);
        return ans;
        
    }
}