class Solution {
    double check(double x, int n){
        if(n==0){
            return 1.0;
        }
        double h = check(x, n/2);
        if(n%2 == 0){
            return h * h;
        }
        else{
            return x * h * h;
        }
      
}    
    public double myPow(double x, int n) {
        if(n<0){
            return 1.0 / check(x, -n);
        }
        return check(x, n);
    }
}