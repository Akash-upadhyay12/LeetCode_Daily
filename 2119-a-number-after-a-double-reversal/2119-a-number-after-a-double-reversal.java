class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = num;
        int rev = 0;

        while(num>0){
            int d = num % 10;
             rev = rev * 10 + d;
            num /= 10;

        } 
        int rev1 = 0;

        while(rev>0){
            int d = rev % 10;
            rev1 = rev1 * 10 + d;
            rev /= 10;

        }
        if(n == rev1){
            return true;
        }
        else{
            return false;
        }

         
    }
}