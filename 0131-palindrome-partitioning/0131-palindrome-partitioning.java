class Solution {
    void check(String s,int i , List<String> cur, List<List<String>> ans){
        if(i==s.length()){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int j =i; j<s.length(); j++){
            if(found(s, i, j)){
                cur.add(s.substring(i, j+1));
                check(s, j+1, cur, ans);
                cur.remove(cur.size()-1);
            }
        }

    }
    boolean found(String s, int left, int right){
        
        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        int left = 0;
        int right = s.length()-1;
        List<String> cur = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        check(s, 0, cur, ans);
        return ans;
        
    }
}