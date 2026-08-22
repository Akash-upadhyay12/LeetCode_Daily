class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro= 1;
        int x = n;
        while(n>0){
            int digit = n % 10;
            sum += digit;
            pro *= digit;
            n /= 10;
        }
        int ans = sum + pro;
        return x % ans == 0  ? true : false;
        
    }
}