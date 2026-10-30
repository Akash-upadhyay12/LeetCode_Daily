class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        while(c <= n){
            int d = a + b + c;
            if(d== n){
                return true;
            }
            else{
                a = b;
                b = c;
                c = a + b;
            }
        }
        return false;
        
    }
}