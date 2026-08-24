class Solution {
    public int countCommas(int n) {
        int ans = 0;
        if(n>=1000){
            if(n<=100000){
                return 1 + n - 1000;
            }
        }
        return 0;
        
    }
}