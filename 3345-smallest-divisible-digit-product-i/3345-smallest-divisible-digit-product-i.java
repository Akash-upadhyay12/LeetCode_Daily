class Solution {
    public int smallestNumber(int n, int t) {
        // for(int i= n; i<=100; i++){
        //     int pro = 1;
        //     int x = i;
        //     while(x>0){
        //         int digit = x % 10;
        //         pro *= digit;
        //         x /= 10;
        //     }
        //     if(pro % t == 0){
        //         return i;
        //     }
        // }
        // return -1;
        boolean check = true;
        int i = n;
        while(check){
            int x = i;
            int p = 1;
            while(x>0){
                int digit = x % 10;
                p *= digit;
                x /= 10;
            }
            if(p % t == 0){
                break;
            }
            else{
                i++;
            }
        }
        return i;















        
        
    }
}