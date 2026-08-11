class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
         int count = 0;
         for(int x : nums){
            int y = x;
            while(y>0){
                int d = y % 10;
                if(d == digit){
                    count++;
                }
                y /= 10;
            }
            
         }
         return count;
        
    }
}