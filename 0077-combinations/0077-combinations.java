import java.util.ArrayList;
import java.util.List;

class Solution {
    void check(int k, int i, ArrayList<Integer> cur, List<List<Integer>> ans,int n) {
        if (cur.size() == k) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int j = i; j<=n; j++){
            cur.add(j);
            check(k, j+1, cur, ans, n);
            cur.remove(cur.size()-1);

        }
        
    }

    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> cur = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        check(k, 1, cur, ans, n);
        return ans;
    }
}