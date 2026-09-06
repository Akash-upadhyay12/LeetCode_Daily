class Solution {
    public int countRotations(String s, int k) {
        int ans = 0;
        for(int i = 0; i<s.length(); i++){
            int count = 0;
            for(int j = 0; j<s.length()-1; j++){
                int first = (i + j)%s.length();
                int sec = (i + j + 1)%s.length();
                if(s.charAt(first) == s.charAt(sec)){
                    count++;
                }
            }
            if(count == k){
                ans++;
            }
        }
        return ans;
        
    }
}