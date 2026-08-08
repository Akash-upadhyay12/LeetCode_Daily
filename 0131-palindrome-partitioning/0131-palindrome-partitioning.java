class Solution {
    void check(String s, int i,ArrayList<String> cur, List<List<String>> ans){
        //This is my first helper function for add valid palindrome to list
        if(i==s.length()){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int j = i; j<s.length(); j++){
            if(func(s, i, j)){
                cur.add(s.substring(i, j+1));
                check(s, j+1, cur, ans);
                cur.remove(cur.size()-1);
            }
        }

    }
    boolean func(String s, int l, int r){
        // This is my second helper function for validating the string
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;


    }
    public List<List<String>> partition(String s) {
        ArrayList<String> cur = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        int l = 0;
        int r = s.length()-1;
        check(s, 0, cur, ans);
        return ans;
        
    }
}