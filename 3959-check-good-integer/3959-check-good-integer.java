class Solution {
    public boolean checkGoodInteger(int n) {
    int sum1 = 0;
    int sum2 = 0;
    int k = n;
    while(n>0){
        int digit = n % 10;
        sum1+= digit;
        n /= 10;
    }
    while(k>0){
        int digit = k % 10;
        digit *= digit;
        sum2+= digit;
        k /= 10;
    }
    if(sum2-sum1 >= 50){
        return true;

    }
    else{
        return false;
    }
        
    }
}