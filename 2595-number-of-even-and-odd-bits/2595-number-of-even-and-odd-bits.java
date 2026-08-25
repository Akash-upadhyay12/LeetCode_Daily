class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        boolean use = false;
        while(n>0){
            int digit = n % 2;
            if(use == false){
                if(digit == 1){
                    even++;
                }
                use = true;
            }
            else{
                if(digit == 1){
                    odd++;
                }
                use = false;
            }
            n /= 2;

        }
        int [] arr = new int[2];
        arr[0] = even;
        arr[1] = odd;
        return arr;
        
    }
}