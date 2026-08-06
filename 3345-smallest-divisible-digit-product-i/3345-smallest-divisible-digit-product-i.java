class Solution {
    public int smallestNumber(int n, int t) {
        for(int i= n; i<=100; i++){
            int pro = 1;
            int x = i;
            while(x>0){
                int digit = x % 10;
                pro *= digit;
                x /= 10;
            }
            if(pro % t == 0){
                return i;
            }
        }
        return -1;
        
        
    }
}