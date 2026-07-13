class Solution {
    public boolean checkGoodInteger(int n) {
        int sum =0;
        int sum1=0;
        int mul=1;
        while(n>0){
            int digit=n%10;
         sum=digit+sum;
            mul=digit*digit;
            sum1=sum1+mul;
            n=n/10;
        }
        if((sum1-sum)>=50){
            return true;
        }
        return false;
    }
}