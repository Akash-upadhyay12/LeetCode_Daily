class Solution {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int)Math.sqrt(c);
        while(i<=j){
            long sum = 1L * i * i + 1L * j * j;
            if(sum == c){
                return true;
            }
            else if(sum > c){
                j--;
            }
            else{
                i++;

            }
            
        }
        return false;
        
    }
}