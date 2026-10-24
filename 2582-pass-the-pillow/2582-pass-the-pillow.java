class Solution {
    public int passThePillow(int n, int time){
        if(n == time){
            return n-1;
        }
        if(time < n){
            return time + 1;
        }
        int ans1 = n - 1;
        int ans2 = time / ans1;
        if(ans2 % 2 != 0){
            int ans3 = time % ans1;
            return n - ans3;
        }
        else{
            int ans3 = time % ans1;
            return ans3+1;
        }  
        
    }
}