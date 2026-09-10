class Solution {
    public long countCommas(long n) {
        if(n <= 999){
            return 0;
        }
        long a = 1000L;
        long b = 1000000L;
        long c = 1000000000L;
        long d = 1000000000000L;
        long e = 1000000000000000L;
        if(n >= a && n<=b-1){
            long ans = n - 999;
            return ans;
        }
        else if(n>=b && n<=c-1){
            long ans = (n-999)*2-(1000000-1000);
            return ans;
        }
        else if(n>=c && n<=d-1){
            long ans = (n - 999)*3-1000998000L;
            return ans;
        }
        else if(n>=d && n<=e-1){
            long ans = (n - 999)*4-1000000000000L - 1000997000L;
            return ans;
        }
        else{
            return (n-999)*5 + 998998999004000L-2000000000000000L;
        }

        
    }
}