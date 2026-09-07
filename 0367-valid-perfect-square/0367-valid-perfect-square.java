class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 0;
        while(i<=46342){
           int ans = i * i;
           if(ans == num){
            return true;
           }
           i++;
        }
        return false;    
    }
}