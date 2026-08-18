class Solution {
    public int numSub(String s) {
        int mod = 1000000007;
        int count = 0;
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                count++;
                sum = (sum + count) % mod;
            }
            else{
                count = 0;
            }
        }
        return sum;
        
    }
}