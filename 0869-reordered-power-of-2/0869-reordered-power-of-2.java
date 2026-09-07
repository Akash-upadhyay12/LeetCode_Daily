class Solution {
    public boolean reorderedPowerOf2(int n) {
        int [] freq = new int[10];
        while(n>0){
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }
        int i = 0;
        while(i<32){
            int ans = (int)Math.pow(2, i);
            int [] arr = new int[10];
            while(ans > 0){
                int digit = ans%10;
                arr[digit]++;
                ans /= 10;
            }
            if(Arrays.equals(arr, freq)){
                return true;
            }
            i++;
        }
        return false;
    }

}