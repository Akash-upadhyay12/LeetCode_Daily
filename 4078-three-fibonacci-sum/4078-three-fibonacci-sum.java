class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        while(true){
            d = a + b + c;
            if(d == n){
                return true;
            }
            if(d > n){
                return false;
            }
            a = b;
            b = c;
            c = a + b;
        }
        
    }
}