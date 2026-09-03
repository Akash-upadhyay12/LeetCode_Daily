class Solution {
    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        
        int k = 1000;
        while(k-->0){
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                int pro = digit * digit;
                sum += pro;
                n /= 10;
            }
            if(sum == 1){
                return true;
            }
            n = sum;
        }
        return false;
        
    }
}