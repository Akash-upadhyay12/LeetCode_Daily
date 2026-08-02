class Solution {
    public int alternateDigitSum(int n) {
        int count = 0;
        int x = n;
        while(x>0){
            int digit = x % 10;
            count++;
            x /= 10;
        }
        int sum = 0;
        if(count%2 == 0){
            boolean curr = false;
            while(n>0){
                int digit = n % 10;
                if(curr == false){
                    sum -= digit;
                    curr = true;
                }
                else{
                    sum += digit;
                    curr = false;
                }
                n /= 10;
            }
            return sum;
        }

        int sum2 = 0;
        if(count%2 != 0){
            boolean curr = false;
            while(n>0){
                int digit = n % 10;
                if(curr == false){
                    sum2 += digit;
                    curr = true;
                }
                else{
                    sum2 -= digit;
                    curr = false;
                }
                n /= 10;
            }
            return sum2;
        }
        return 0;   
    }
}