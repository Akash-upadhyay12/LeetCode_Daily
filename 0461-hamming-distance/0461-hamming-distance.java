class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        while(x > 0 && y > 0){
            int d1 = x % 2;
            int d2 = y % 2;
            if(d1 != d2){
                count++;
            }
            x /= 2;
            y /= 2;
        }
        while(x > 0){
            int d1 = x % 2;
            if(d1 == 1){
                count++;
            }
            x /= 2;
        }
        while(y > 0){
            int d2 = y % 2;
            if(d2 == 1){
                count++;
            }
            y /= 2;
        }
        return count;
        
    }
}