import java.util.*;
class Solution {
    void check(String s, int i, StringBuilder cur, List<String> ans) {
        if(cur.length() == s.length()){
            ans.add(cur.toString());
            return;
        }
        cur.append(s.charAt(i));
        check(s, i + 1, cur, ans);
        cur.deleteCharAt(cur.length()-1);
        if(Character.isUpperCase(s.charAt(i))){
            cur.append(Character.toLowerCase(s.charAt(i)));
            check(s, i + 1, cur, ans);
            cur.deleteCharAt(cur.length()-1);
        }
        if(Character.isLowerCase(s.charAt(i))){
            cur.append(Character.toUpperCase(s.charAt(i)));
            check(s, i + 1, cur, ans);
            cur.deleteCharAt(cur.length()-1);
        }
    }

    public List<String> letterCasePermutation(String s) {
        StringBuilder cur = new StringBuilder();
        List<String> ans = new ArrayList<>(); 
        check(s, 0, cur, ans);
        return ans;
    }
}
