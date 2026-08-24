class Solution {
    public int distanceTraveled(int x, int y) {
        int sum = 0;
        int count = 0;
        while(x > 0){
            sum += 1 * 10;
            count++;
            x--;
            if(count == 5){
                if(y >= 1){
                    count = 0;
                    x++;
                    y--;
                }

            }
        }
        return sum;
        
    }
}