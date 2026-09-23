class Solution {
    public int countHomogenous(String s){
        int mod = 1000000007;
        if(s.length() == 1){
            return 1;
        }
        int count = 1;
        int sum = 1;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                count = 1;
            }
            sum = (sum + count) % mod;
        }
        return sum;
        
    }
}