class Solution {
    public int countHomogenous(String s) {
        long mod = 1000000007;
        long ans = 0;
        long count = 1;
        if (s.isEmpty()) return (int)ans;
        for(int i = 0; i < s.length(); i++){
            if(i+1<s.length()){
                if(s.charAt(i) == s.charAt(i+1)){
                    count++;
                }
                else{
                ans = (ans + (count*(count+1)/2) % mod);
                count = 1;
            }
        }
        else{
            ans = (ans + (count*(count+1)/2) % mod);

        }
            
            
            
        }
        return (int)ans;
    }
}