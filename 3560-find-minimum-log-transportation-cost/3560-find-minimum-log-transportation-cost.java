class Solution {
    public long minCuttingCost(int n, int m, int k){
        if(n <= k && m <= k){
            return 0L;
        }
        long cost = 0L;
        if(n > k){
            if(n % k == 0){
                cost += (long) k * k;
            }
            else{
                long rem = n % k;
                cost += rem * k;
            }
        }    
        if(m > k){
            if(m % k == 0){
                cost += (long) k * k;
            }
            else{
                long rem = m % k;
                cost += rem * k;
            }
        }
        return cost;
    }
}
