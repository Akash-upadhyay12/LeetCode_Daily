class Solution {
    public int countHomogenous(String s) {
        int mod = 1000000007;
        int count = 1;
        int sum = 1;
        
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
                sum = (sum + count)%mod;
            }
            else{
                sum += 1;
                count = 1;
            }
           
        }
        return sum % mod;
        
    }
}