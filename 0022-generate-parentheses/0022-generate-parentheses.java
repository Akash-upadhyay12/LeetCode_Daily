class Solution {
    void check(int n, int open, int close,StringBuilder cur, List<String> ans){
        if(open == n && close == n){
            ans.add(cur.toString());
            return;
        }
        if(open<n){
            cur.append('(');
                check(n, open +1, close, cur,  ans);
                cur.deleteCharAt(cur.length()-1);
            
        }
        if(close<open){
            cur.append(')');
            check(n, open, close+1, cur, ans);
            cur.deleteCharAt(cur.length()-1);
        }
        


    }
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        StringBuilder cur = new StringBuilder();
        List<String> ans = new ArrayList<>();
        check(n, open, close, cur, ans);
        return ans;
        
    }
}